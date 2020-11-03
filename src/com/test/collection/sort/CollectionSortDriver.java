/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package com.test.collection.sort;

import com.test.Movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Pramit Karmakar
 * Created on 05/10/20
 */

public class CollectionSortDriver {

    public static void main(String[] args) {

        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8, 2015));
        list.add(new Movie("Star Wars", 7, 1977));
        list.add(new Movie("Empire Strikes Back", 9, 1980));
        list.add(new Movie("Return of the Jedi", 10, 1983));

        /*Collections.sort(list, (m1, m2) -> {
            if (m1.getYear() - m2.getYear() > 1) return 1;
            if (m1.getYear() - m2.getYear() < 1) return -1;
            else return 0;
        });

        Comparator<Movie> byName = Comparator.comparing(Movie::getName);
        Collections.sort(list, byName);*/

        Comparator<Movie> byRating = Comparator.naturalOrder();
        Collections.sort(list, byRating);
        //list.forEach(movie -> System.out.println(movie.toString()));

        System.out.println("Sort by name");

        list.forEach(movie -> System.out.println(movie.getName()));
    }
}
