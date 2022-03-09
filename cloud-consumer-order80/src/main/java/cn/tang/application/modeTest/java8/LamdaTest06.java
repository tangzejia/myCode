package cn.tang.application.modeTest.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LamdaTest06 {
    public static void main(String[] args) {


        List<Employee> list= Arrays.asList(
                new Employee("tt","ff",12),
                new Employee("mm","ll",13),
                new Employee("nn","pp",16)
        );

        list.stream().map(e->e.getAge());


        List<String> list2=Arrays.asList("aa","bb","bb","cc");


        Stream<Stream<Character>> streamStream = list2.stream().map(LamdaTest06::getCh);
        streamStream.forEach(e->e.forEach(System.out::println));


        Stream<Character> characterStream = list2.stream().flatMap(LamdaTest06::getCh);
        characterStream.forEach(System.out::println);


    }

      public  static Stream<Character> getCh(String str){
         List<Character> list=new ArrayList<>();
         for (Character c:str.toCharArray()){
             list.add(c);
         }

        return list.stream();
      }


}
