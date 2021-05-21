package com.learm.stream;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {

        List<User> userList = supplyUser.get();

        List<User> findEmp = userList.stream().filter( user -> user.getName().equalsIgnoreCase("peter")).collect(Collectors.toList());

        Map<Integer, String> userMap = userList.stream().collect(Collectors.toMap(User::getAge, User::getName));
        Integer totalAge = userList.stream().map(User::getAge).reduce(0, (u, v) -> (u+v));
        int max = userList.stream().mapToInt(User :: getAge).max().orElseThrow(NoSuchElementException::new);
        List<User> retired = userList.stream().filter(u-> u.getAge() > 60).collect(Collectors.toList());
        Comparator c = Comparator.comparing(User::getAge,Comparator.reverseOrder());
        String names = userList.stream().map(User::getName).collect(Collectors.joining(","));

        OptionalDouble avg = userList.stream().mapToInt(User::getAge).average();
        int r = userList.stream().mapToInt(u -> u.getAge() * u.getAge()).filter(u -> u>1000).sum();


        userList.sort(c);

        System.out.println(userMap);
        System.out.println(totalAge);
        System.out.println(names);
        System.out.println(avg.getAsDouble());

    }


    static Supplier<List<User>> supplyUser = () -> {

        List<User> userList = new ArrayList<>();
        userList.add(new User("Peter", 20));
        userList.add(new User("Sam", 40));
        userList.add(new User("Ryan", 60));
        userList.add(new User("Adam", 70));
        userList.add(new User("Peter", 30));

        return userList;
    };
}



