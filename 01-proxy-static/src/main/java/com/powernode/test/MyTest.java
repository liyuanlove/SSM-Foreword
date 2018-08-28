package com.powernode.test;

import com.powernode.proxy.SomeServiceProxy;
import com.powernode.service.ISomeService;

public class MyTest {

    public static void main(String[] args) {
        ISomeService service = new SomeServiceProxy();
        String result = service.doFirst();
        System.out.println("result = " + result);
        service.doSecond();
    }

}
