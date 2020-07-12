/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package com.learn.functional.programing;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author Pramit Karmakar
 * Created on 16/05/20
 */

public class _Supplier {

    public static void main(String[] args) {

        Supplier<List<String>> nameList = () -> {
            ArrayList<String> names = new ArrayList<String>();
            names.add("PK");
            names.add("KK");
            return names;
        };


        System.out.println(nameList.get());

    }
}
