package com.solvd.javalab.thread;

import org.apache.log4j.Logger;

public class Resource {

    private static final Logger log = Logger.getLogger(Resource.class);

    synchronized void test1(Resource s2) throws InterruptedException {
        log.info("test1-begin");
        Thread.sleep(1000);

        // taking object lock of s2 enters
        // into test2 method
        s2.test2(this);
        log.info("test1-end");
    }

    synchronized void test2(Resource s1) throws InterruptedException {
        log.info("test2-begin");
        Thread.sleep(2000);

        // taking object lock of s1 enters
        // into test1 method
        s1.test1(this);
        log.info("test2-end");
    }

}
