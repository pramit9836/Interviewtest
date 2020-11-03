/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package falabella.test;

import java.util.*;

/**
 * @author Pramit Karmakar
 * Created on 10/08/20
 */

public class Question1 {



    public static void main(String[] args) {

        String s = "abcab";
        System.out.println(minChanges(s));
    }

    public static int minChanges(String s)
    {
        int MAX_CHAR = 26;
        int n = s.length();
        if (n > MAX_CHAR)
            return -1;
        int distCount = 0;
        int count[] = new int[MAX_CHAR];
        for(int i = 0; i < MAX_CHAR; i++)
            count[i] = 0;

        for (int i = 0; i < n; i++)
        {
            if(count[s.charAt(i)-'a'] == 0)
                distCount++;
            count[s.charAt(i)-'a']++;
        }

        return (n-distCount);
    }
}