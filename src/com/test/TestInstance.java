/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package com.test;

/**
 * @author Pramit Karmakar
 * Created on 17/05/20
 */

public enum TestInstance {

    INSTANCE;
    private int i;

    public void set(int i) {
        this.i = i;
    }

    public int get() {return i;}
}
