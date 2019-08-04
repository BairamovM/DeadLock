package com.solvd.javalab.thread;

import org.apache.log4j.Logger;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        // creating one and second object
        Resource s1 = new Resource();
        Resource s2 = new Resource();

        // creating first and second threads and starting
        FirstThread t1 = new FirstThread(s1, s2);
        SecondThread t2 = new SecondThread(s1, s2);
        t1.start();
        t2.start();

    }

}
