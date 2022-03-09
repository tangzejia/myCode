package cn.tang.application.modeTest.java8_2;


import java.util.function.Function;
import java.util.function.Predicate;

public class java8_06 {
    public static void main(String[] args) {

        get(msg1->{
            return msg1.contains("h");
        },msg2->{
            return msg2.contains("l");
        });

    }


    public static boolean get(Predicate<String> p1,Predicate<String> p2){
      boolean   b1=p1.and(p2).test("hello");
        System.out.println(b1);
        return b1;
    }

}
