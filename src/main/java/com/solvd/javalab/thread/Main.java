package com.solvd.javalab.thread;

import org.apache.log4j.Logger;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {




        FirstResource firstResource = new FirstResource();
        SecondResource secondResource = new SecondResource();
        firstResource.secondResource = secondResource;
        secondResource.firstResource = firstResource;

        FirstThread firstThread = new FirstThread("FirstThread");
        firstThread.firstResource = firstResource;
       //firstThread.setPriority(1);

        SecondThread secondThread = new SecondThread ("SecondThread");
        secondThread.secondResource = secondResource;
        //secondThread.setPriority(10);





        firstThread.start();
        try {
            firstThread.join();
        } catch (InterruptedException e) {
            System.out.println(firstThread.getName());
        }

       secondThread.start();
//        try {
//            secondThread.join();
//        } catch (InterruptedException e) {
//            System.out.println(secondThread.getName());
//        }

        log.info("Main thread finished");

    }

}
