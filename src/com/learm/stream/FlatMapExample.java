/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package com.learm.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Pramit Karmakar
 * Created on 28/09/20
 */

public class FlatMapExample {

    public static void main(String[] args) {

        List<String> houseGryffindor = Arrays.asList("Albus", "Harry", "Ron", "Hermione");
        List<String> houseHufflepuff = Arrays.asList("Bridget", "Cedric", "Nymphadora");
        List<String> houseRavenclaw = Arrays.asList("Luna", "Garrick", "Filius");
        List<String> houseSlytherin = Arrays.asList("Severus", "Tom", "Phineas");

        List<List<String>> hogwarts = new ArrayList<List<String>>();
        hogwarts.add(houseGryffindor);
        hogwarts.add(houseHufflepuff);
        hogwarts.add(houseRavenclaw);
        hogwarts.add(houseSlytherin);

        System.out.println(hogwarts);

        List<String> flatMap = hogwarts.stream().flatMap(group -> group.stream()).collect(Collectors.toList());

        flatMap.forEach(System.out::println);

    }
}
