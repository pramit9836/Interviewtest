/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package com.gs.coderpad;

/**
 * @author Pramit Karmakar
 * Created on 12/07/20
 */

public class LongestRepeatingChar {

    public static void main(String[] args) {

        String input = "saaabbc";
        System.out.println(findLongestRepeatingChar(input));
    }

    private static String findLongestRepeatingChar(String input) {

        int frequency = 1;
        String longestChar = "";
        for (int i = 0; i < input.length(); i++) {
            int tempFrequency = 0;
            while (i + 1 < input.length() && input.charAt(i) == input.charAt(i+1)) {
                tempFrequency++;
                i++;
            }
            if (tempFrequency > frequency) {
                longestChar = ""+input.charAt(i);
            }
        }

        return longestChar;
    }
}
