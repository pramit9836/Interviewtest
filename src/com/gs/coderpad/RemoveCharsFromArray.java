/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package com.gs.coderpad;

import java.util.*;

/**
 * @author Pramit Karmakar
 * Created on 04/07/20
 */

public class RemoveCharsFromArray {

    public static void main(String[] args) {

        String[] s = {"a","b","c","c","c","d","e","e"};
        List<String> inputArray = new ArrayList<String>(Arrays.asList(s));
        System.out.println(getShrunkArray(inputArray,3));

    }

    public static List<String> getShrunkArray(List<String> inputArray, int burstLength) {

        LinkedHashMap<String, Integer> countMap = new LinkedHashMap<String, Integer>();

        for (String s : inputArray) {
            if (countMap.get(s) == null) countMap.put(s, 1);
            else {
                countMap.put(s, countMap.get(s) + 1);
            }
        }
        for (String s : countMap.keySet()) {
            if (countMap.get(s) >= burstLength) {
                inputArray.removeAll(Collections.singleton(s));
            }
        }
        return inputArray;
    }
}
