package com.learn.functional.programing;

public interface DefaultTest {

    default void defaultPrint() {
        System.out.println("Printing from default method");
    }
}
