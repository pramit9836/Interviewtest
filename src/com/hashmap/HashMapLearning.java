package com.hashmap;

import java.util.HashMap;

public class HashMapLearning {

    public static void main(String[] args) {

        Account a1 = new Account(1,"a");
        Account a2 = new Account(2,"b");

        HashMap<Account, String> acc = new HashMap<>();
        acc.put(a1,a1.getHolderName());
        acc.put(a2, a2.getHolderName());
        a1.setHolderName("d");
        acc.put(a1,a1.getHolderName());

        System.out.println(acc);


    }
}
