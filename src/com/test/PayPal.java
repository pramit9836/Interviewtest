

package com.test;

import com.test.singleton.SingletonInstance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.*;

/**
 * @author Pramit Karmakar
 * Created on 13/05/20
 */

public class PayPal {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        /*Singleton singleton = Singleton.getInstance("Pramit");
        System.out.println(singleton.name);
        Singleton obj2 = Singleton.getInstance("Kankana");
        System.out.println(singleton.name);
        Hashtable<String, String> h = null;
        ConcurrentMap<String, String> h2 =null;

        Student s = new Student(1,"abc");
        Student s1 = new Student(2,"abc");
        s.equals(s1);*/

        /*ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(list, (o1, o2) -> {
            if (o1.getRating() < o2.getRating()) return -1;
            if (o1.getRating() > o2.getRating()) return 1;
            return 0;
        });

        System.out.println("Movies after sorting : ");
        for (Movie movie: list)
        {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }*/

       /* Animal cow = new Animal();
        cow.drink();
        cow.eat();

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


        GenericTest<Integer> gt = new GenericTest();
        System.out.println("Generic:"+gt.convertString(12));


        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> f = executor.submit(() -> {
            return 1;
        });
        executor.shutdown();

        System.out.println("Feature value:"+f.get());

        //System.out.println(future.get().toString());



    }
}
