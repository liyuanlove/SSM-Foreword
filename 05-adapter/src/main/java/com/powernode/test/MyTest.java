package com.powernode.test;

import com.powernode.worker.ICooker;
import com.powernode.worker.IProgrammer;
import com.powernode.worker.impl.JdProgrammer;
import com.powernode.worker.impl.QjdCooker;

public class MyTest {

    public static void main(String[] args) {
        ICooker qjdCooker = new QjdCooker();
        IProgrammer jdProgrammer = new JdProgrammer();
        System.out.println(qjdCooker.cook());
        System.out.println(jdProgrammer.program());
    }

}
