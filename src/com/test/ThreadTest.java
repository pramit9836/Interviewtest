/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package com.test;

import java.util.concurrent.Callable;

/**
 * @author Pramit Karmakar
 * Created on 15/05/20
 */

public class ThreadTest implements Callable, Runnable {
    @Override
    public void run() {
        System.out.println("Thread strated..");
        /*try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println("Thread ended..");



    }

    @Override
    public Object call() throws Exception {
        return null;
    }
}
