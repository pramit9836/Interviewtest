package com.inheritance;

public class InheritanceDriver {

    public static void main(String[] args) {
        Parent p = new Child();
        Parent pp = new Parent();
        pp.displayValue(3);
        Child c = new Child();
        p.displayValue(1);
        p.display();
        p=null;
        p.display();
        c.display();
    }
}
