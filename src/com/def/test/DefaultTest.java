/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package com.def.test;

/**
 * @author Pramit Karmakar
 * Created on 26/08/20
 */

public class DefaultTest implements Default1, Default2  {


    public static void main(String[] args) {

        new DefaultTest().print();

    }

    @Override
    public void print() {
        System.out.println("Main method");

    }
}
