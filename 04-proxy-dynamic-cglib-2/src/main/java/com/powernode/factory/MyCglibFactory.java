package com.powernode.factory;

import java.lang.reflect.Method;

import com.powernode.service.ISomeService;
import com.powernode.service.SomeServiceImpl;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MyCglibFactory implements MethodInterceptor {

    private ISomeService target;

    public MyCglibFactory() {
        target = new SomeServiceImpl();
    }

    public ISomeService myCglibCreator() {
        //创建增强器对象
        Enhancer enhancer = new Enhancer();
        //指定目标类，即父类
        enhancer.setSuperclass(ISomeService.class);
        //设置回调接口对象
        enhancer.setCallback(this);
        return (ISomeService) enhancer.create();
    }

    //回调方法
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy)
            throws Throwable {
        Object result = method.invoke(target, args);
        if (null != result) {
            result = ((String) result).toUpperCase();
        }
        return result;
    }

}
