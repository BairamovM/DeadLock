package com.solvd.javalab.thread;

import org.apache.log4j.Logger;

public class SecondThread extends Thread {

    private Resource s1;
    private Resource s2;

    private static final Logger log = Logger.getLogger(FirstThread.class);

    // constructor to initialize fields
    public SecondThread(Resource s1, Resource s2)
    {
        this.s1 = s1;
        this.s2 = s2;
    }


    // run method to start a thread
    @Override
    public void run () {


        // taking object lock of s2
        // enters into test2 method
        try {
            s2.test2(s1);
        } catch (InterruptedException e) { }

    }
}
