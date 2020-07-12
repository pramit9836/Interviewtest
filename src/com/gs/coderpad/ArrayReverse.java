/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package com.gs.coderpad;

/**
 * @author Pramit Karmakar
 * Created on 12/07/20
 */

public class ArrayReverse {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int revArray[] = reverse(arr);
        for (int i = 0; i < revArray.length; i++)
            System.out.print(revArray[i] + " ");

    }

    private static int[] reverse(int[] arr) {

        int end = arr.length - 1;
        int start = 0;
        while (end > start) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
