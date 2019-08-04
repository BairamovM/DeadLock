package com.solvd.javalab.thread;

import org.apache.log4j.Logger;
import com.solvd.javalab.thread.SecondResource;

public class FirstThread extends Thread {

    private static final Logger log = Logger.getLogger(FirstThread.class);

    FirstThread (String name) {

        super(name);

    }

    SecondResource secondResource;
    FirstResource firstResource;

    @Override
    public void run () {

        System.out.println( "Start " + Thread.currentThread().getName());
        log.info("Start " + Thread.currentThread().getName());

        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {

            System.out.println("Thread has been interrupted");
            log.info("Thread has been interrupted");

        }
        System.out.println( "Finish " + Thread.currentThread().getName());
        log.info("Finish " + Thread.currentThread().getName());
        System.out.println(firstResource.getVal());

    }

}
