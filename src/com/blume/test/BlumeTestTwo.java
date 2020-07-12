/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package com.blume.test;

import java.util.Arrays;

/**
 * @author Pramit Karmakar
 * Created on 29/05/20
 */

public class BlumeTestTwo {
    public static void main(String[] args) {
        String s = "asdfkjeghfalawefhaef";
        System.out.println(fewestCoins(s));
    }
    public static int fewestCoins(String coins) {
        // Write your code here
        final int MAX_CHARECTERS = 100000;
        int coinLength = coins.length();


        int distinctCharCount = 0;

        boolean[] visited = new boolean[MAX_CHARECTERS];
        Arrays.fill(visited, false);
        for (int i = 0; i < coinLength; i++) {
            if (visited[coins.charAt(i)] == false) {
                visited[coins.charAt(i)] = true;
                distinctCharCount++;
            }
        }

        int start = 0;
        int startIndex = -1;
        int maxValue = Integer.MAX_VALUE;

        int count = 0;
        int[] currCount = new int[MAX_CHARECTERS];
        for (int j = 0; j < coinLength; j++) {

            currCount[coins.charAt(j)]++;

            if (currCount[coins.charAt(j)] == 1)
                count++;

            if (count == distinctCharCount) {
                while (currCount[coins.charAt(start)] > 1) {
                    if (currCount[coins.charAt(start)] > 1)
                        currCount[coins.charAt(start)]--;
                    start++;
                }
                int len_window = j - start + 1;
                if (maxValue > len_window) {
                    maxValue = len_window;
                    startIndex = start;
                }
            }
        }
        return (coins.substring(startIndex, startIndex + maxValue)).length();

    }

}
