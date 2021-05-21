package com.morgan.stanley;

import java.util.*;

public class Ques1 {

    public static void main(String[] args) {


    }

    public static Iterator reverse(List list) {
        Collections.reverse(list);
        return list.iterator();
    }
}

class Node {

    int row;
    int col;
    public Node(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

class Emp {}

class Acc extends  Emp {}
