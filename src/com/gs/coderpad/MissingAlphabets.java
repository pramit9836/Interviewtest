/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package com.gs.coderpad;

/**
 * @author Pramit Karmakar
 * Created on 12/07/20
 */

public class MissingAlphabets {
    public static void main(String[] args) {
        String input = "dafghjklacaav";
        System.out.println(findMissingAlphabets(input.toLowerCase()));
    }

    private static String findMissingAlphabets(String input) {

        boolean[] boolArray = new boolean[26];

        for (int i = 0; i < boolArray.length; i++) {
            char c = (char)(i+97);
            if (input.contains(Character.toString(c))) {
                boolArray[i] = true;
            }
        }
        String returnString = "";
        for (int i = 0; i < boolArray.length; i++) {
            if(!boolArray[i]) {
                returnString += Character.toString((char)(i+97));
            }
        }
        return returnString;
    }
}
