package com.imcon;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author lhm
 * @date 2020/10/8 22:24
 */
public class Second  implements JavaSamplerClient{

  private static  final  String URLNAME="URL";

  private  static final String  URLDEFAULTURL="https://www.baidu.com/";

  private  String  resultDate;

    /**
     *在jmeter中需要显示的属性
     * @return
     */
    public Arguments getDefaultParameters() {

        System.out.println("getDefaultParameters run ");
        Arguments arguments=new Arguments();
        arguments.addArgument(URLNAME,URLDEFAULTURL);
        return arguments;
    }
   private  String iputurl;
    /**
     *运行前初始化
     * @param javaSamplerContext
     */
    public void setupTest(JavaSamplerContext javaSamplerContext) {
        iputurl=javaSamplerContext.getParameter(URLNAME,URLDEFAULTURL);
        System.out.println("setupTest run ");
        System.out.println(iputurl);
    }

    /**
     * 实现具体功能逻辑的方法
     * @param javaSamplerContext
     * @return
     */

    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
        SampleResult result =new SampleResult();
        StringBuffer sb= new StringBuffer();
        try {
            URL url=new URL(iputurl);
            URLConnection connection=url.openConnection();

            byte [] buffer=new byte[1024];
            int len;
            result.sampleStart();
            InputStream in=connection.getInputStream();
            while ((len=in.read(buffer))!=-1)
            {
                resultDate=new String(buffer,"UTF-8");
                sb.append(resultDate);

            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        resultDate=sb.toString();
        result.setResponseData(resultDate,null);
        result.setSampleLabel("请求名称");
        result.setSuccessful(true);
        result.setDataType(SampleResult.TEXT);
        return  result;
    }

    /**
     *运行结束后操作
     * @param javaSamplerContext
     */
    public void teardownTest(JavaSamplerContext javaSamplerContext) {
        System.out.println("teardownTest run ");
    }


}
