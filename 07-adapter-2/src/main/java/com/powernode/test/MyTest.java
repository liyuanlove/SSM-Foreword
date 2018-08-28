package com.powernode.test;

import java.util.ArrayList;
import java.util.List;

import com.powernode.adapter.IWorkerAdapter;
import com.powernode.adapter.impl.CookerAdapter;
import com.powernode.adapter.impl.ProgrammerADapter;
import com.powernode.worker.ICooker;
import com.powernode.worker.IProgrammer;
import com.powernode.worker.impl.JdProgrammer;
import com.powernode.worker.impl.QjdCooker;

public class MyTest {

    public static void main(String[] args) {
        ICooker qjdCooker = new QjdCooker();
        IProgrammer jdProgrammer = new JdProgrammer();
        Object[] workers = {qjdCooker, jdProgrammer};

        //循环遍历每个工种对象，让每个工种对象在适配器中逐个进行匹配
        for (Object worker : workers) {
            IWorkerAdapter adapter = getAdapter(worker);
            System.out.println(adapter.work(worker));
        }
    }

    /**
     * 根据worker获取相应的适配器对象
     *
     * @param worker
     * @return
     */
    private static IWorkerAdapter getAdapter(Object worker) {
        List<IWorkerAdapter> adapters = getAllAdapters();
        for (IWorkerAdapter adapter : adapters) {
            if (adapter.supports(worker)) {
                return adapter;
            }
        }
        return null;
    }

    /**
     * 获取所有的适配器
     *
     * @return
     */
    private static List<IWorkerAdapter> getAllAdapters() {
        List<IWorkerAdapter> adapters = new ArrayList<>();
        adapters.add(new CookerAdapter());
        adapters.add(new ProgrammerADapter());
        return adapters;
    }

}
