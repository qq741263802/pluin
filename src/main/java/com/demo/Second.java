package com.demo;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

/**
 * @author lhm
 * @date 2020/10/8 22:24
 */
public class Second  implements JavaSamplerClient{

  private static  final  String URLNAME="URL";

  private  static final String  URLDEFAULTURL="WWW.BAIDU.COM";

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

    /**
     *运行前初始化
     * @param javaSamplerContext
     */
    public void setupTest(JavaSamplerContext javaSamplerContext) {
        System.out.println("setupTest run ");
    }

    /**
     * 实现具体功能逻辑的方法
     * @param javaSamplerContext
     * @return
     */

    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
        System.out.println("runTest run ");
        return  null;
    }

    /**
     *运行结束后操作
     * @param javaSamplerContext
     */
    public void teardownTest(JavaSamplerContext javaSamplerContext) {
        System.out.println("teardownTest run ");
    }


}
