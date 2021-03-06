
package com.learm.stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Pramit Karmakar
 * Created on 16/05/20
 */

public class FilterStreamLearning {

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("Peter", 20, Arrays.asList("1", "2")),
                new User("Sam", 40, Arrays.asList("3", "4", "5")),
                new User("Ryan", 60, Arrays.asList("6")),
                new User("Adam", 70, Arrays.asList("7", "8"))
        );

        List<String> userNames = Arrays.asList("Peter", "Sam", "Ayan", "Adam");

        List<String> findAny = userNames.stream().filter(user -> user.startsWith("S")).collect(Collectors.toList());

        System.out.println("Findany: "+findAny);

        users.stream().filter(user -> user.getAge() > 60).forEach(user -> System.out.println(user.getName()+" is retired"));
        List<String> activeUser = users.stream().filter(user -> user.getAge() < 60).map(User::getName).collect(Collectors.toList());
        activeUser.forEach(System.out::println);
        System.out.println(activeUser);

        List<String> userReplacement = new ArrayList<>();

        int ss = users.stream().map(User::getAge).collect(Collectors.toList()).stream().reduce(0, Integer::sum);

        List<String> usersList1 = userNames.stream().filter(user -> user.startsWith("A")).map(user -> {
            String s = user.replaceAll("A","aa");
            return s;
        }).collect(Collectors.toList());

        System.out.println("new-------|");
        usersList1.forEach(user -> System.out.println("Username: " + user ));

        List<User> usersList = userNames.stream().filter(user -> (user.startsWith("A") && (user.startsWith("Ay"))))
                .map(User::new).collect(Collectors.toList());

        long l = userNames.stream().filter(user -> user.startsWith("A")).count();
        System.out.println("test------");
        usersList.forEach(System.out::println);
        System.out.println("test------");
        System.out.println("Total objects: "+l);

        int sum = users.stream().mapToInt(User :: getAge).sum();
        System.out.println("Total age sum: "+sum);

        /*List<String> usr = */users.stream().map(user -> user.getPhoneNumbers().stream()).
                flatMap(phoneNumber -> phoneNumber.filter(phone -> phone.equals("5"))).
                forEach(System.out::println);

        users.stream().map(user -> user.getPhoneNumbers().stream()).flatMap(phoneNumbers -> phoneNumbers.
                filter(number -> number.startsWith("1"))).forEach(System.out::println);
        Optional<String> res = userNames.stream().filter(name -> name.startsWith("A")).findAny();
        System.out.print("Printing optional:: ");
        res.ifPresent(System.out::println);

        if (userNames.stream().anyMatch(user -> user.equalsIgnoreCase("peter" ))) {
            System.out.println("Name found");
        }
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> integers1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> integers2 = Arrays.asList(1, 2, 3, 4, 5);
        List<List<Integer>> masterList = new ArrayList<>();
        masterList.add(integers);
        masterList.add(integers1);
        masterList.add(integers2);

        Integer suum = integers.stream().mapToInt(Integer::valueOf).sum();
        suum = integers.stream().reduce(0,Integer::sum);
        System.out.println(suum);

        int total  = integers.parallelStream().reduce(0, Integer::sum);
        int totalAge = users.parallelStream().reduce(0, (partialAge ,user) -> partialAge + user.getAge(), Integer::sum);

        System.out.println("Total age::"+totalAge);

        List<Integer> flatlist = masterList.stream().flatMap(Collection::stream).filter(a -> (a%2 == 0)).collect(Collectors.toList());
        flatlist.forEach(System.out::print);

        Integer a = 101;
        Integer aa = 100;
        if (a.equals(aa)) {
            System.out.println("true");
        }
        if (a == aa) {
            System.out.println("true 2");
        }

        String input = "";
        Map<String, Integer> lengthMap = Arrays.stream(input.split(" ")).collect(Collectors.toMap(value -> value, String::length));

        List<Integer> number = new ArrayList<Integer>(Arrays.asList(10,11,47,50,34,99,21));

        long sort = number.stream().filter(n -> n > 50).count();



    }

}
