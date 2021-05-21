package com.inheritance;

public class Child extends Parent {


    public void displayValue(int i) {
        System.out.println("Child: "+i);
    }

    public static void display() {
        System.out.println("Child");
    }
}
