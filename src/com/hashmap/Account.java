package com.hashmap;

import java.util.HashMap;

public class Account {


    private int accountNumber;
    private String holderName;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Account(int accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    //Depends only on account number
    /*@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + accountNumber;
        return result;
    }

    //Compare only account numbers
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (accountNumber != other.accountNumber)
            return false;
        return true;
    }*/

    @Override
    public String toString() {
        String s = ""+this.getAccountNumber();
        return s;
    }
}
