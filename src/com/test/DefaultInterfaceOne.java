package com.test;

public interface DefaultInterfaceOne {

    default String getAddress() {
        return "Home address";
    }

    static String getBungalowAddress() {
        return "Flat address";
    }
}
