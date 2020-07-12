
package com.learn.functional.programing;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author Pramit Karmakar
 * Created on 16/05/20
 *
 * Represents an operation that accepts a single input argument and returns no
 * result.
 */

public class _Consumer {

    public static void main(String[] args) {

        consumer.accept(new Person("Haana", "Montana"));

        biConsumer.accept(new Person("Haana", "Montana"), false);



    }

    static BiConsumer<Person, Boolean> biConsumer = (person, flag) -> {
        if(flag) {
            System.out.println("First Name: " + person.firstName);
            System.out.println("Last Name: " + person.lastName);
        } else {
            System.out.println("Hidden Information");
        }

    };

    static Consumer<Person> consumer = person -> {
        System.out.println(person.firstName);
        System.out.println(person.lastName);

    };

    public static class Person {
        public String firstName;
        public String lastName;

        Person (String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }
}
