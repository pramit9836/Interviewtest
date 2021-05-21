package com.morgan.stanley;

public class TestSeven extends  Thread{

    private static int x;
    public synchronized void doThings()  {
        int cu = x;
        cu++;
        x = cu;

    }
    public void run() {
        doThings();
    }
}
