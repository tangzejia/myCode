package cn.tang.application.modeTest.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

public class LamdaTest05 {
    public static void main(String[] args) {


        Stream.iterate(0,x->x+2).limit(10).forEach(System.out::println);

        Stream<String> stringStream = Stream.of("12", "22");
        stringStream.forEach(System.out::println);



    }




}
