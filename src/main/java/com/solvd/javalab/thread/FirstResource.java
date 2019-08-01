package com.solvd.javalab.thread;

public class FirstResource {

    SecondResource secondResource;
    public synchronized int getVal (){
        return secondResource.returnVal();
    }

    public synchronized int returnVal() {
        return 1;
    }

}
