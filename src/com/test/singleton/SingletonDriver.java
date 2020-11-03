/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package com.test.singleton;

import com.test.TestInstance;

/**
 * @author Pramit Karmakar
 * Created on 05/10/20
 */

public class SingletonDriver {

    public static void main(String[] args) {


        SingletonInstance instance  = SingletonInstance.INSTANCE;
        instance.setInstance(10);
        System.out.println("Instance value:"+instance.getInstance());
        instance.setInstance(15);
        System.out.println("Instance value:"+instance.getInstance());

        TestInstance ts = TestInstance.INSTANCE;
        System.out.println("before seting var:"+ts.get());
    }
}
