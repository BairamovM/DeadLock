package com.solvd.javalab.thread;

import org.apache.log4j.Logger;

public class SecondThread extends Thread {

    private static final Logger log = Logger.getLogger(FirstThread.class);

    SecondThread (String name) {

        super(name);
    }

    SecondResource secondResource;

    @Override
    public void run () {

        System.out.println( "Start " + Thread.currentThread().getName());
        log.info("Start " + Thread.currentThread().getName());

        try{
            Thread.sleep(100);
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
            log.info("Thread has been interrupted");
        }
        System.out.println("Finish " + Thread.currentThread().getName());
        log.info("Finish " + Thread.currentThread().getName());
        System.out.println(secondResource.getVal());

    }
}
