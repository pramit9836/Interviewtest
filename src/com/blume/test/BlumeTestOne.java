
package com.blume.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Pramit Karmakar
 * Created on 29/05/20
 */

public class BlumeTestOne {

    public static void main(String[] args) {

        List<Integer> used = new ArrayList<Integer>(Arrays.asList(3,2,1,3,1));
        List<Integer> partition = new ArrayList<Integer>(Arrays.asList(3,5,3,5,5));

        System.out.println(minPartitions(used, partition));
    }

    public static int minPartitions(List<Integer> used, List<Integer> total) {

        int sum = used.stream().reduce(0, Integer::sum);
        Collections.sort(total, Collections.reverseOrder());
        int count = 0;
        for (int space : total) {
            if (sum <= 0) return count;
            else if (sum == space) return count+1;
            else {
                sum -= space;
                count++;
            }
        }

        return count;
    }
}
