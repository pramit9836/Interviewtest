/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package subex.test;

/**
 * @author Pramit Karmakar
 * Created on 22/06/20
 */

public class Question1 {

    public static void main(String[] args) {

        String str = "naman";
        System.out.println(cost(str));
        int i =10;
        int x = i%2;
    }

    static int cost(String input1)
    {
        try {
            int n = input1.length();
            int count = 0;
            if (input1.contains(" ")) return -1;
            for (int i =0; i< n/2; ++i)
                if(input1.charAt(i) != input1.charAt( n - i - 1))
                    ++count;
            if (count >= 0) return count;
            else return -1;
        } catch(Exception e ){
            throw new UnsupportedOperationException("swaps(String input1)");
        } finally {
            return -100;
        }
    }

}
