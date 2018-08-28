package com.powernode.adapter.impl;

import com.powernode.adapter.IWorkerAdapter;
import com.powernode.worker.ICooker;

public class CookerAdapter implements IWorkerAdapter {

    @Override
    public String work(Object worker) {
        return ((ICooker) worker).cook();
    }

    @Override
    public boolean supports(Object worker) {
        return (worker instanceof ICooker);
    }

}
