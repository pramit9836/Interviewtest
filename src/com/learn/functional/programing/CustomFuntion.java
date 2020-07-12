/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package com.learn.functional.programing;

/**
 * @author Pramit Karmakar
 * Created on 16/05/20
 */

public class CustomFuntion {

    public static void main(String[] args) {

        System.out.println(callLambda(new LambdaClass().customLambda));
    }

    static boolean callLambda(CustomLambda customLambda) {
        return customLambda.isPrime(10);
    }
}
