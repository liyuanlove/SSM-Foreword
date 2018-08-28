package com.powernode.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyTest {

    @Before
    public void before() {
        System.out.println("执行before()方法");
    }

    @After
    public void after() {
        System.out.println("执行after()方法");
    }

    @Test
    public void test01() {
        System.out.println("执行test01()");
    }

    @Test
    public void test02() {
        System.out.println("执行test02()");
    }

}
