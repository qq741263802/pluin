package com.demo;

import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

/**
 * @author lhm
 * @date 2020/10/8 22:10
 */
public class First  extends AbstractJavaSamplerClient{
    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
        System.out.println("jmeter test");
        return  null;
    }
}
