package com.powernode.adapter.impl;

import com.powernode.adapter.IWorkerAdapter;
import com.powernode.worker.IProgrammer;

public class ProgrammerADapter implements IWorkerAdapter {

    @Override
    public String work(Object worker) {
        return ((IProgrammer) worker).program();
    }

    @Override
    public boolean supports(Object worker) {
        return (worker instanceof IProgrammer);
    }

}
