package com.solvd.javalab.thread;

import org.apache.log4j.Logger;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) throws InterruptedException {

        // creating one object
        Resource s1 = new Resource();

        // creating second object
        Resource s2 = new Resource();

        // creating first thread and starting it
        FirstThread t1 = new FirstThread(s1, s2);
        t1.start();

        // creating second thread and starting it
        SecondThread t2 = new SecondThread(s1, s2);
        t2.start();

        // sleeping main thread
        Thread.sleep(2000);









    }

}
