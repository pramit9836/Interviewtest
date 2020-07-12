/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package com.test;

/**
 * @author Pramit Karmakar
 * Created on 14/05/20
 */

public class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Student s1 , Student s2) {
        if (s1.getId() == s2.getId()) {
            return true;
        }
        return false;
    }


    public boolean equals(Student s) {
        if (this.getId() == s.getId()) {
            return true;
        }
        return false;
    }
}
