/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package com.learn.functional.programing;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author Pramit Karmakar
 * Created on 16/05/20
 */

public class _Predicate {

    public static void main(String[] args) {

        System.out.println(predicate.test("+919836146314"));
        System.out.println(predicate.test("+929836146314"));
        System.out.println(pred().test("+929836146314"));

    }

    static Predicate<String> predicate = string -> {
      if (string.length() == 13 && string.startsWith("+91")) {
          System.out.println("Valid phone number");
          return true;
      } else {
          System.out.println("Invalid phone number");
      }
      return false;
    };

    static Predicate<String> pred() {
        return predi -> predi.length() == 13;
    }

}
