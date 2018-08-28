package com.powernode.factory;

import java.lang.reflect.Method;

import com.powernode.service.SomeService;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MyCglibFactory implements MethodInterceptor {

    private SomeService target;

    public MyCglibFactory() {
        target = new SomeService();
    }

    public SomeService myCglibCreator() {
        //创建增强器对象
        Enhancer enhancer = new Enhancer();
        //指定目标类，即父类
        enhancer.setSuperclass(SomeService.class);
        //设置回调接口对象
        enhancer.setCallback(this);
        return (SomeService) enhancer.create();
    }

    //回调方法
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        Object result = method.invoke(target, args);
        if (null != result) {
            result = ((String) result).toUpperCase();
        }
        return result;
    }

}
