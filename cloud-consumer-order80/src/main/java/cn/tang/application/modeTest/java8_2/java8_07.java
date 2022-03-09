package cn.tang.application.modeTest.java8_2;


import java.util.Date;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class java8_07 {
    public static void main(String[] args) {

        Date date=new Date();
        Supplier<Long> supplier = ()->date.getTime();
        System.out.println(supplier.get());
        Supplier<Long> supplier2 =date::getTime;
        System.out.println(supplier2.get());


//        BiFunction<String,Integer,String> biFunction= String::substring;
        BiFunction<String,Integer,String> biFunction=(e,f)->e.substring(f);
        String hell = biFunction.apply("hell", 3);

        System.out.println(hell);


        Supplier<Person> supplier1=Person::new;
        System.out.println(supplier1.get());
    }

}
