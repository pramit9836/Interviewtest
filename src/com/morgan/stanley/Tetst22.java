package com.morgan.stanley;

import java.util.Optional;

public class Tetst22 {

    public static void main(String[] args) {
        Optional<String> opt = Optional.of(null);
        System.out.println(opt.get());
    }
}

class base {
    int n;
    base(int i) {
        n = i;
    }
}

class c extends base {
    int count;
    c(int count, int n){
        super(n);
        this.count = count;
    }

    c(int count){
        this(count,0);
    }
}
