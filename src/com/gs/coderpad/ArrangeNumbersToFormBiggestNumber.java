
package com.gs.coderpad;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Pramit Karmakar
 * Created on 09/07/20
 */

public class ArrangeNumbersToFormBiggestNumber {

    public static void main(String[] args) {
        String[] arr = {"54","546","548","60"};
        List<String> numberList = new ArrayList<String>(Arrays.asList(arr));
        System.out.println(getBiggestNumber(numberList));

    }

    public static String getBiggestNumber(List<String> numberList) {
        numberList.sort((x, y) -> (y+x).compareTo(x+y));

        String returnString = numberList.stream().reduce("",(x,y) -> x+y);
        //numberList.forEach(System.out::print);

        return returnString;
    }
}
