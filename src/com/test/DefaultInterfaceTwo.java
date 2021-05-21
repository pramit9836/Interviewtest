package com.test;

public interface DefaultInterfaceTwo {

    default String getAddress() {
        return "Present address";
    }

    static String getBungalowAddress(){
        return "Bungalow Address";
    }
}
