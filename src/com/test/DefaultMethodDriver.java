package com.test;

public class DefaultMethodDriver implements DefaultInterfaceOne, DefaultInterfaceTwo{

    public static void main(String[] args) {

        System.out.println(new DefaultMethodDriver().getAddress());
        //System.out.println(new DefaultMethodDriver().getBungalowAddress());
        System.out.println(DefaultInterfaceTwo.getBungalowAddress());
        System.out.println(DefaultInterfaceTwo.getBungalowAddress());
        System.out.println(DefaultInterfaceOne.getBungalowAddress());


    }
    @Override
    public String getAddress() {
        return DefaultInterfaceTwo.super.getAddress();
    }

}
