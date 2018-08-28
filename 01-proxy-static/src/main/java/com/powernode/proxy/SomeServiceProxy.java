package com.powernode.proxy;

import com.powernode.service.ISomeService;
import com.powernode.service.SomeServiceImpl;

/**
 * 代理类
 */
public class SomeServiceProxy implements ISomeService {

    private ISomeService target;

    public SomeServiceProxy() {
        //创建目标对象
        target = new SomeServiceImpl();
    }

    @Override
    public String doFirst() {
        //代理类调用目标方法
        String result = target.doFirst();
        //增强就发生在这里
        return result.toUpperCase();
    }

    @Override
    public void doSecond() {
        ISomeService target = new SomeServiceImpl();
        target.doSecond();
    }

}
