/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package com.exception.handle;

/**
 * @author Pramit Karmakar
 * Created on 26/08/20
 */

public class ExceptionHandle extends AbstractTest{

    AbstractTest abt;

    public static int divide(int x) throws CustomException {

        //try {
            return x/(x-1);
        /*} catch(Exception e) {
            System.out.println("Exception in divide()");
            //throw new CustomException("Fake exception");
        }
        return 0;*/
    }

    public static void main(String[] args) {

        new ExceptionHandle().printer();

        int y = 3;
        while ( y!=0) {
            y--;
            try {
                int val = divide(1);
            } catch (Exception e) {
                System.out.println("In main");
                e.printStackTrace();
            }
        }
    }

    public void test() {
        abt.fax();
    }

    @Override
    public void printer() {
        System.out.println("Print");
    }
}
