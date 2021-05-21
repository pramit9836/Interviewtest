package com.inheritance;

import java.util.Optional;

public class Test {

    public void display(String s) {
        System.out.println("String");
    }

    public void display(Object obj) {
        System.out.println("Object");
    }

    public static void main(String[] args) {
        /*new Test().display(null);

        Integer i = 123;
        Integer j = 123;
        System.out.println(i==j);*/

        Optional<String> opt = Optional.of("baeldung");
        System.out.println(opt.get());
    }


}
