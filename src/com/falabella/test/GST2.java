/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package com.falabella.test;

/**
 * @author Pramit Karmakar
 * Created on 04/07/20
 */

public class GST2 {

    public static void main(String[] args) {
        int arr[] = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
        int x = 280;
        System.out.println(subArrayLength(arr,x));

    }

    static int subArrayLength(int[] arr, int x) {
        int start = 0;
        int length = arr.length;
        for (int i = 0; i < arr.length; i++) {
            start = arr[i];
            int sum = start;
            if(start > x) return 1;
            else {
                for (int j = i+1; j < arr.length; j++) {
                    sum += arr[j];
                    if (sum > x && (j-i)<length) length = j-i+1;
                }
            }
        }
        return length;
    }
}
