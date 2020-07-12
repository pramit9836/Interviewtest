
package com.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Pramit Karmakar
 * Created on 22/06/20
 */

public class ThreadTestMain {

    public static void main(String[] args) {

    /*
        ThreadTest th = new ThreadTest();
        Thread t = new Thread(th);
        t.start();
        t.sleep(6000);

        Thread t2 = new Thread(new Thread(() -> System.out.println("Thread 2")));
        t2.start();


        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future future = executor.submit((Callable) () -> "Saab changa si");
        executor.execute(() -> System.out.println("Thread runable"));*/

        Thread th = new Thread(() -> {
            System.out.println("In thread");
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Sleep over thread");
        });
        th.start();

        Thread thh = new Thread(() -> {
        });

        Runnable runable = () -> {
            System.out.println("In runable thread");
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Sleep over runable");
        };
        runable.run();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future f = executor.submit((Callable) () -> 1);

        Runnable r = () -> {

        };
    }

}
