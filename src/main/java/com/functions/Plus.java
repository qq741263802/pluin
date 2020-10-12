package com.functions;

import org.apache.jmeter.engine.util.CompoundVariable;
import org.apache.jmeter.functions.AbstractFunction;
import org.apache.jmeter.functions.InvalidVariableException;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.samplers.Sampler;

import java.util.Collection;
import java.util.List;

/**
 * @author lhm
 * @date 2020/10/12 23:48
 */
public class Plus extends AbstractFunction {
    /**
     * 执行方法
     * @param sampleResult
     * @param sampler
     * @return
     * @throws InvalidVariableException
     */
    public String execute(SampleResult sampleResult, Sampler sampler) throws InvalidVariableException {
        return null;
    }

    /**
     * 获取用户传递参数
     * @param collection
     * @throws InvalidVariableException
     */
    public void setParameters(Collection<CompoundVariable> collection) throws InvalidVariableException {

    }

    /**
     * 功能名称
     * @return
     */
    public String getReferenceKey() {
        return null;
    }

    /**
     * 功能描述
     * @return
     */
    public List<String> getArgumentDesc() {
        return null;
    }
}
