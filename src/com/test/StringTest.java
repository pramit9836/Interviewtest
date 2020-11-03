
package com.test;

import java.util.*;

/**
 * @author Pramit Karmakar
 * Created on 15/05/20
 */

public class StringTest {
    public static void main(String[] args){
        /*ArrayList<String> list = new ArrayList<>(Arrays.asList("abcc", "defffg", "abcxxr", "efggteer"));
        ArrayList<Character> ch = new ArrayList<Character>();
        int totalCount =0;
        list.forEach(l -> {
                    char c ;
                    int count = 0;
                    boolean flag = false;
                    *//*ch.addAll(Arrays.asList(l.toCharArray())).forEach(c ->{

                    })*//*
        });*/
        //System.out.println("{\"action\": \"CANCEL_SHIPMENT\",\"userId\":\"SYS_ADMIN\", \"logEvent\": \"aged-shipment\"}");

        String s = "abc";
        s = s + "d";
        System.out.println(s);

        Set<Emp> set = new HashSet<Emp>();
        set.add(new Emp(10,"a"));
        set.add(new Emp(10,"a"));
        System.out.println(set.size());


        HashMap<String, String> hm = new HashMap<String,String>();
        hm.put("a", "b");
        hm.put("b", "c");

        for (Map.Entry<String,String> entry : hm.entrySet()) {
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
            //hm.put("d","e");
        }

        System.out.println(exp());
        stringTest("bc");
        String ss = new String("dfg");
        if (ss == "dfg") System.out.println("TRUE"); else System.out.println("FALSE");

    }


    public static boolean exp() {
        try {
            return true;
        } finally {
            System.out.println("finally");
            return false;

        }
    }

    public static void stringTest(String s) {
        //String x = "abc";
        String y = "abc";
        if (s == y) System.out.println("string test: " + true);
        else System.out.println("string test: " + false);
    }


}
