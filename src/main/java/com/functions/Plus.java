package com.functions;

import org.apache.commons.lang3.StringUtils;
import org.apache.jmeter.engine.util.CompoundVariable;
import org.apache.jmeter.functions.AbstractFunction;
import org.apache.jmeter.functions.InvalidVariableException;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.samplers.Sampler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author lhm
 * @date 2020/10/12 23:48
 */
public class Plus extends AbstractFunction {
    private Object[] values;
    private CompoundVariable first,second;

    /**
     * 执行方法
     * @param sampleResult
     * @param sampler
     * @return
     * @throws InvalidVariableException
     */
    public String execute(SampleResult sampleResult, Sampler sampler) throws InvalidVariableException {
         first=(CompoundVariable)values[0];
         second=(CompoundVariable)values[1];
         if (first.execute().trim()==null || StringUtils.isBlank(first.execute().trim()))
         {
             return "第一个参数不能为空";
         }
        if (second.execute().trim()==null || StringUtils.isBlank(second.execute().trim()))
        {
            return "第二个参数不能为空";
        }
        int count=new Integer(first.execute().trim()) + new Integer(second.execute().trim());
        return String.valueOf(count);

    }

    /**
     * 获取用户传递参数
     * @param collection
     * @throws InvalidVariableException
     */
    public void setParameters(Collection<CompoundVariable> collection) throws InvalidVariableException {

        checkParameterCount(collection,2);
        values=collection.toArray();

    }

    /**
     * 功能名称
     * @return
     */
    public String getReferenceKey() {
        return "_PlusSum";
    }

    /**
     * 功能描述
     * @return
     */
    public List<String> getArgumentDesc() {
        List desc=new ArrayList();
        desc.add("第一个值");
        desc.add("第二个值");
        return desc;
    }
}
