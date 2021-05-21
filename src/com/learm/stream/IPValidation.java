package com.learm.stream;

import java.util.Arrays;

public class IPValidation {

    public static void main(String[] args) {
        String ip = "127.0.0.260";

        String[] ipArray = ip.split("\\.");
        boolean isValid = false;
        System.out.println(ipArray.length);

        if (ipArray.length == 4) {
            isValid = Arrays.stream(ipArray).allMatch(s -> (Integer.parseInt(s) < 255) && (Integer.parseInt(s) >= 0));
        }
        if (isValid) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
