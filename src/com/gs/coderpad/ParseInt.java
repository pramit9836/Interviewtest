/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package com.gs.coderpad;

/**
 * @author Pramit Karmakar
 * Created on 12/07/20
 */

public class ParseInt {

    public static void main(String[] args) {
        String input = "-12345";
        integerParse(input);
        System.out.println(Integer.parseInt(input));
    }

    private static void integerParse(String input) {

        int asciiValofZero = (int) '0';
        int sum = 0;
        boolean isMinus = false;
        for (char c : input.toCharArray()) {
            if (c == (int)'-') {
                isMinus = true;
            } else {
                sum = sum * 10 + (int) c - asciiValofZero;
            }
        }
        if (isMinus) {
            sum = 0 - sum;
        }
        System.out.println(sum);
    }
}
