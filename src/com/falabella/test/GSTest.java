
package com.falabella.test;

/**
 * @author Pramit Karmakar
 * Created on 04/07/20
 */

public class GSTest {

    public static void main(String[] args) {

        String s =  "This is ram";
        String alph = "abcdefghijklmnopqrstuvwxyz";
        for (char c : alph.toCharArray()) {
            if (!s.toLowerCase().contains(""+c)) {
                System.out.print(c);
            }
        }
        printMissing(s);
    }

    static void printMissing(String str) {
        boolean[] mark = new boolean[26];

        // For indexing in mark[]
        int index = 0;

        // Traverse all characters
        for (int i = 0; i < str.length(); i++) {
            // If uppercase character, subtract 'A'
            // to find index.
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
                index = str.charAt(i) - 'A';

                // If lowercase character, subtract 'a'
                // to find index.
            else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')

                index = str.charAt(i) - 'a';

                // If this character is other than english
                // lowercase and uppercase characters.
            else
                continue;
            mark[index] = true;
        }

        System.out.println();
        // Return false if any character is unmarked
        for (int i = 0; i <= 25; i++)
            if (mark[i] == false) {
                System.out.print((char)(i+97));
            }
    }

}
