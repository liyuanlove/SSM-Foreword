package com.powernode.test;

import com.powernode.adapter.IWorkerAdapter;
import com.powernode.adapter.impl.WorkerAdapter;
import com.powernode.worker.ICooker;
import com.powernode.worker.IProgrammer;
import com.powernode.worker.impl.JdProgrammer;
import com.powernode.worker.impl.QjdCooker;

public class MyTest {

    public static void main(String[] args) {
        ICooker qjdCooker = new QjdCooker();
        IProgrammer jdProgrammer = new JdProgrammer();
        Object[] workers = {qjdCooker, jdProgrammer};

        //创建适配器对象
        IWorkerAdapter adapter = new WorkerAdapter();
        //循环遍历每个工种对象，让每个工种对象在适配器中逐个进行匹配
        for (Object worker : workers) {
            String workContent = adapter.work(worker);
            System.out.println(workContent);
        }
    }

}
