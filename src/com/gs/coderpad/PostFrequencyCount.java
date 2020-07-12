
package com.gs.coderpad;

/**
 * @author Pramit Karmakar
 * Created on 09/07/20
 */

public class PostFrequencyCount {
    public static void main(String[] args) {
        String  s = "aabbcdeeefa";
        findFrequencyString(s);
    }

    private static void findFrequencyString(String s) {
        String output = "";
        for (int position = 0; position < s.length(); position++) {
            int count = 1;
            while (position +1 < s.length() && s.charAt(position) == s.charAt(position + 1)) {
                position++;
                count++;
            }
            output = count > 1 ? output + s.charAt(position) + count : output + s.charAt(position);
        }
        System.out.println(output);
    }
}
