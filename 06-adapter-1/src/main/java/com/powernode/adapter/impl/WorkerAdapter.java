package com.powernode.adapter.impl;

import com.powernode.adapter.IWorkerAdapter;
import com.powernode.worker.ICooker;
import com.powernode.worker.IProgrammer;

/**
 * 适配器类
 */
public class WorkerAdapter implements IWorkerAdapter {

    @Override
    public String work(Object worker) {
        String workContent = "";
        if (worker instanceof ICooker) {
            workContent = ((ICooker) worker).cook();
        } else if (worker instanceof IProgrammer) {
            workContent = ((IProgrammer) worker).program();
        }
        return workContent;
    }

}
