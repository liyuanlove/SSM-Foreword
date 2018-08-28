package com.powernode.test;

import com.powernode.factory.MyCglibFactory;
import com.powernode.service.ISomeService;

public class MyTest {

    public static void main(String[] args) {
        ISomeService service = new MyCglibFactory().myCglibCreator();
        String result = service.doFirst();
        System.out.println("result = " + result);
        service.doSecond();
    }

}
