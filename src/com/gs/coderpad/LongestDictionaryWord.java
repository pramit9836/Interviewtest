/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package com.gs.coderpad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Pramit Karmakar
 * Created on 12/07/20
 */

public class LongestDictionaryWord {


    public static void main(String[] args) {
        List<String> dictionary = new ArrayList<String>();
        dictionary.add("ale");
        dictionary.add("applee");
        dictionary.add("monkey");
        dictionary.add("plea");
        String input = "apple";
        System.out.println(findLongestWord(dictionary,input));
    }

    private static String findLongestWord(List<String> dictionary, String input) {

        List<Map<Character, Integer>> dictList = new ArrayList<>();

        for (String s : dictionary) {
            Map<Character, Integer> frequencyMap = getFrequencyMap(s);
            dictList.add(frequencyMap);
        }

        Map<Character, Integer> wordFreqMap = getFrequencyMap(input);


        int i = 0;
        String longsetWord = "";
        for (Map<Character, Integer> dictWord : dictList) {
            boolean flag = true;
            for (Map.Entry<Character, Integer> m : wordFreqMap.entrySet()) {
                if (null == dictWord.get(m.getKey())  || dictWord.get(m.getKey()) < m.getValue()) {
                    flag = false;
                    break;
                }
            }
            i++;
            if (flag && longsetWord.length() < dictionary.get(i).length()) {
                longsetWord = dictionary.get(i);
            }
        }
        return longsetWord;
    }


    public static Map<Character, Integer> getFrequencyMap(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (frequencyMap.get(c) == null) frequencyMap.put(c,1);
            else frequencyMap.put(c, frequencyMap.get(c) + 1);
        }
        return frequencyMap;
    }

}
