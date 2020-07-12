/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package com.gs.coderpad;

/**
 * @author Pramit Karmakar
 * Created on 04/07/20
 */

public class FrequencyCount {

    public static void main(String[] args) {
        String s = "GGGGGrrrrrrrrrrrrrrtr";
        System.out.println(collapseString(s));
    }

    public static String collapseString(String inputString) {

        String result = "";
        for (int charecter = 0; charecter < inputString.length(); charecter++) {

            int count = 1;
            while (charecter + 1 < inputString.length()
                    && inputString.charAt(charecter)
                    == inputString.charAt(charecter + 1)) {
                charecter++;
                count++;
            }

            result = count > 1 ? result + "" + count + inputString.charAt(charecter)  :
                    result + inputString.charAt(charecter);
        }
        return result;
    }
}
