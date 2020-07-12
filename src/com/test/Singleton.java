/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package com.test;
/**
 * @author Pramit Karmakar
 * Created on 14/05/20
 */

public class Singleton {

    private static Singleton singleton;

    public final String name;

    private Singleton( String name ) {
        this.name = name;
    }

    public static Singleton getInstance(String name) {
        if (singleton == null) {
            return new Singleton(name);
        }
        return singleton;
    }


}
