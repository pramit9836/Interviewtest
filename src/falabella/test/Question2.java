/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package falabella.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Pramit Karmakar
 * Created on 10/08/20
 */

public class Question2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getList(6,5,10).toArray()));
        //System.out.println(Arrays.toString(getList(5,4,11).toArray()));
    }

    public static List<Integer> getList(int n, int lo, int hi) {

        List<Integer> list = new ArrayList<Integer>();
        if (n-1 > (hi-lo)) {
            list.add(0,-1);
            return list;
        }



        int posOfHighest = n >3 ? ((n/3)-1) : 0;


        if (n > 3) {
            posOfHighest = 0;
        } else if (n%3 == 0) {
            posOfHighest = n/3 -1;
        } else {
            posOfHighest = n/3;
        }



        int start = hi-posOfHighest;
        int next = hi;
        for(int i=0; i < posOfHighest; i++) {
            list.add(i, start);
            start++;
        }
        list.add(posOfHighest, hi);
        for (int j = posOfHighest+1; j<n; j++) {
            list.add(j,next-1);
            next--;
        }
        return list;
    }
}
