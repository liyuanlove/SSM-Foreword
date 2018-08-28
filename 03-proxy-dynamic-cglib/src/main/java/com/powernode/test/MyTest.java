package com.powernode.test;

import com.powernode.factory.MyCglibFactory;
import com.powernode.service.SomeService;

public class MyTest {

    public static void main(String[] args) {
        SomeService service = new MyCglibFactory().myCglibCreator();
        String result = service.doFirst();
        System.out.println("result = " + result);
        service.doSecond();
    }

}
