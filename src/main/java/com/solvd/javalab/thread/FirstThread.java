package com.solvd.javalab.thread;

import org.apache.log4j.Logger;

public class FirstThread extends Thread {

    private Resource s1;
    private Resource s2;

    private static final Logger log = Logger.getLogger(FirstThread.class);

    // constructor to initialize fields
    public FirstThread(Resource s1, Resource s2)
    {
        this.s1 = s1;
        this.s2 = s2;
    }

    // run method to start a thread
    @Override
    public void run () {

        // taking object lock of s1 enters
        // into test1 method
        try {
            s1.test1(s2);
        } catch (InterruptedException e) { }

    }

}
