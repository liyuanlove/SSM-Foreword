package com.powernode.service;

/**
 * 目标类
 */
public class SomeServiceImpl implements ISomeService {

    @Override
    public String doFirst() {
        System.out.println("执行doFirst()方法");
        return "abcde";
    }

    @Override
    public void doSecond() {
        System.out.println("执行doSecond()方法");
    }

}
