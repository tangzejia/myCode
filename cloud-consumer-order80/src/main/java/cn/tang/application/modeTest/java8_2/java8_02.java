package cn.tang.application.modeTest.java8_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class java8_02 {

    public static void main(String[] args) {

        List<Person> list= Arrays.asList(
              new Person("tom",20,"175") ,
                new Person("jerry",16,"160") ,
                new Person("jack",29,"198") ,
                new Person("burry",28,"100") ,
                new Person("peter",10,"136")
        );

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        list.forEach(System.out::println);

        Collections.sort(list,(Person o1,Person o2)->{//Person可以省略
          return   -o1.getAge()-o2.getAge();
        });

        list.forEach(System.out::println);

    }



}

