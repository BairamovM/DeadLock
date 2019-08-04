package com.solvd.javalab.thread;

public class Resource {

    // first synchronized method
    synchronized void test1(Resource s2) throws InterruptedException {
        System.out.println("test1-begin");
        Thread.sleep(1000);

        // taking object lock of s2 enters
        // into test2 method
        s2.test2(this);
        System.out.println("test1-end");
    }

    // second synchronized method
    synchronized void test2(Resource s1) throws InterruptedException {
        System.out.println("test2-begin");
        Thread.sleep(1000);

        // taking object lock of s1 enters
        // into test1 method
        s1.test1(this);
        System.out.println("test2-end");
    }

}
