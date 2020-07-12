
package com.blume.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Pramit Karmakar
 * Created on 29/05/20
 */

public class BlumeTestThree {

    public static void main(String[] args) {
        List<Integer> used = new ArrayList<Integer>(Arrays.asList(5,1,3,7,3));
        System.out.println(minDiff(used));
    }

    public static int minDiff(List<Integer> arr) {
        // Write your code here

        Collections.sort(arr);
        int sum = arr.stream().reduce(0,(a,b) -> (b-a));
        int count = 0;
        for (int i=0; i < arr.size()-1; i++) {
            count = (arr.get(i+1) - arr.get(i)) + count;
        }
        return count;

    }
}
