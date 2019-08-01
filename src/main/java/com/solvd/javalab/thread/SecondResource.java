package com.solvd.javalab.thread;

public class SecondResource {

    FirstResource firstResource;

    public synchronized int getVal() {

        return firstResource.returnVal();
    }

    public synchronized int returnVal() {

        return 2;
    }

}
