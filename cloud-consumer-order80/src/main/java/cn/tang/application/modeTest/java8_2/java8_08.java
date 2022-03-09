package cn.tang.application.modeTest.java8_2;

import java.util.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class java8_08 {

    public static void main(String[] args) {

        ReentrantLock reentrantLock = new ReentrantLock();
//        reentrantLock.

        List<Person> list= Arrays.asList(
              new Person("tom",20,"175") ,
                new Person("jerry",16,"160") ,
                new Person("jack",29,"198") ,
                new Person("burry",28,"100") ,
                new Person("peter",10,"136"),
                new Person("peter",11,"139")
        );

        Map<String, List<Person>> collect2 = list.stream().collect(Collectors.groupingBy(Person::getName));
        collect2.forEach((k,v)-> System.out.println(k+";"+v));

        Optional<Person> collect1 = list.stream().collect(Collectors.maxBy((e1, e2) -> e1.getAge() - e2.getAge()));
        System.out.println(collect1.get());


        List<String> list2= Arrays.asList("zhangsan","lisi","wangwu","fuck");

        List<String> collect = list2.stream().collect(Collectors.toList());
        System.out.println(collect);

        list2.stream().limit(3).forEach(System.out::println);
        list2.stream().map(msg->new String(msg+"ff")) .forEach(System.out::println);

        Integer reduce = Stream.of(1, 2, 3, 5).reduce(0, (x, y) -> {
            return x + y;
        });
        System.out.println(reduce);


        list2.stream().filter((e) -> e.contains("z") && e.length() == 8).forEach(System.out::println);
        System.out.println();


    }



}

