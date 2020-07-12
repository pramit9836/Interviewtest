/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package com.learn.functional.programing;

/**
 * @author Pramit Karmakar
 * Created on 16/05/20
 */

public class LambdaClass {

    CustomLambda customLambda = number -> {
        boolean flag = true;
        for(int i = 2; i <= number/2; ++i)
        {
            // condition for nonprime number
            if(number % i == 0)
            {
                flag = false;
                break;
            }
        }
        return flag;
    };
}
