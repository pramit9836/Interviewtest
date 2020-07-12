/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package com.test;

import java.util.ArrayList;

/**
 * @author Pramit Karmakar
 * Created on 17/05/20
 */

public final class FinalClassExample {

    private final int id;

    private final String name;

    private final ArrayList<String> testList;


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    /**
     * Accessor function for mutable objects
     */
    public ArrayList<String> getTestList() {

        //return testList;
        return (ArrayList<String>) testList.clone();
    }

    /**
     * Constructor performing Deep Copy
     * @param i
     * @param n
     * @param list
     */

    /*public FinalClassExample(int i, String n, ArrayList<String> list){
        System.out.println("Performing Deep Copy for Object initialization");
        this.id=i;
        this.name=n;
        ArrayList<String>tempMap=new ArrayList<String>();
        String key;
        tempMap = (ArrayList<String>) list.stream().collect(Collectors.toList());
        this.testList =tempMap;
    }
*/

    /**
     * Constructor performing Shallow Copy
     * @param i
     * @param n
     * @param list
     */

     public FinalClassExample(int i, String n, ArrayList<String> list){
     System.out.println("Performing Shallow Copy for Object initialization");
     this.id=i;
     this.name=n;
     this.testList=list;
     }

    /**
     * To test the consequences of Shallow Copy and how to avoid it with Deep Copy for creating immutable classes
     * @param args
     */
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, CloneNotSupportedException {
        ArrayList<String> h1 = new ArrayList<String> ();
        h1.add("1");
        h1.add("2");

        String s = "original";

        int i=10;

        FinalClassExample ce = new FinalClassExample(i,s,h1);

        //Lets see whether its copy by field or reference
        System.out.println(s==ce.getName());
        System.out.println(h1 == ce.getTestList());
        //print the ce values
        System.out.println("ce id:"+ce.getId());
        System.out.println("ce name:"+ce.getName());
        System.out.println("ce testMap:"+ce.getTestList());
        //change the local variable values
        i=20;
        s="modified";
        h1.add("3");
        //print the values again
        System.out.println("ce id after local variable change:"+ce.getId());
        System.out.println("ce name after local variable change:"+ce.getName());
        System.out.println("ce testMap after local variable change:"+ce.getTestList());

        ArrayList<String> hmTest = ce.getTestList();
        hmTest.add("4");

        System.out.println("ce testMap after changing variable from accessor methods:"+ce.getTestList());

        /*FinalClassExample fce = (FinalClassExample) Class.forName("com.test.FinalClassExample").newInstance();
        FinalClassExample fceClone = (FinalClassExample)fce.clone();*/
    }

}
