package com.test;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SetsOperations {

    public static void main(String[] args) {


        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(5);

        Set<Integer> s2 = new HashSet<>();
        s2.add(3);
        s2.add(5);
        s2.add(7);
        s2.add(9);
        s2.add(1);

        /*System.out.println(s1.retainAll(s2));
        System.out.println(s1);*/

        Set<Integer> s3 = s1.stream().filter(((Predicate<Integer>) s2::contains).negate()).collect(Collectors.toSet());
        Set<Integer> s4 = s1.stream().filter(s2::contains).collect(Collectors.toSet());


        System.out.println(s3);
        System.out.println(s4);

        Collections.sort(new ArrayList<Integer>(s2), Comparator.reverseOrder());

    }
}
