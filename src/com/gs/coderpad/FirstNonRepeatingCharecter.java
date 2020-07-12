
package com.gs.coderpad;

/**
 * @author Pramit Karmakar
 * Created on 09/07/20
 */

import java.util.*;

/**
 * Given a string, find the first non-repeating character in it. For example, if the input string is “GeeksforGeeks”,
 * then the output should be ‘f’ and if the input string is “GeeksQuiz”, then the output should be ‘G’.
 */
public class FirstNonRepeatingCharecter {

    public static void main(String[] args) {
        String input = "Feeksfor";
        findFirstNonRepeatingCharecter(input);
    }

    private static void findFirstNonRepeatingCharecter(String input) {

        LinkedHashMap<Character,Integer> frequencyMap = new LinkedHashMap<>();

        for (char c  : input.toCharArray()) {
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            } else frequencyMap.put(c, 1);
        }

        /*frequencyMap.forEach((c,v) ->{
            if (v == 1 ) {
                System.out.println(c);
            }
        });*/

        for (Map.Entry e : frequencyMap.entrySet()) {
            if ((Integer) e.getValue() == 1 ) {
                System.out.println(e.getKey());
                break;
            }
        }
        List<Map.Entry<Character, Integer> > list =
                new LinkedList<Map.Entry<Character, Integer> >(frequencyMap.entrySet());
        list.sort(Comparator.comparing(Map.Entry::getKey));
        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        temp.forEach((c,v) ->{
            System.out.println(v);
        });
        return ;
    }

}
