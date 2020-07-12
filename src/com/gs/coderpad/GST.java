
package com.gs.coderpad;

/**
 * @author Pramit Karmakar
 * Created on 12/07/20
 */

public class GST {
    public static void main(String[] args) {
        String s = "aaaabccaa";
    }

    public String frequencyCount(String input) {

        String response = "";
        for (int i = 0; i < input.length(); i++) {

            int count = 1;

            while (input.charAt(i) == input.charAt(i+1) && i+1 < input.length()) {
            count++;
            i++;
            }
            response = count > 1 ? response+input.charAt(i)+count : response+input.charAt(i);
        }
        return response;

    }
}
