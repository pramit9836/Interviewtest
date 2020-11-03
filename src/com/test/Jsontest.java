/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package com.test;

/**
 * @author Pramit Karmakar
 * Created on 22/07/20
 */

public class Jsontest {

    public static void main(String[] args) {

        try{
            System.out.println(task(2));
            System.out.println(task(0));
            System.out.println(task(2));
            System.out.println(task(1));
        } catch (Exception e) {
            System.out.println("error");
        }
    }


    static int task(int i) {
        int j = 0;
        try {
            j = i / i-1;
        } catch (Exception e) {
            System.out.println("eeror");
            //throw new NumberFormatException("wrong number");
        }
        return j;
    }
}
