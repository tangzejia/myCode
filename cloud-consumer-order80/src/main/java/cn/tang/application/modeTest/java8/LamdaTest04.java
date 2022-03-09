package cn.tang.application.modeTest.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class LamdaTest04 {
    public static void main(String[] args) {

        test("dd",x-> System.out.println(x+"ff"));

        test01(10,()->(int)(Math.random()*100));

        test02("ff",(s -> s.toUpperCase()));



    }

    public static void test(String x,Consumer consumer){
        consumer.accept(x);
    }



    public static  void test01(int num, Supplier<Integer> supplier){

        List<Integer> list =new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int n=supplier.get();
            list.add(n);
        }


    }

    public static  String test02(String num, Function<String,String> function){

        String str=function.apply(num);
        return str;


    }


    public static  void test03(List<String> list, Predicate<String> predicate){

        List<String> listStr =new ArrayList<>();
        for(String str:list){
            if(predicate.test(str)){
                listStr.add(str);
            }

        }


    }



    public static  void test04(){
        Comparator<Integer> comparator=Integer::compareTo;
        int compare = comparator.compare(1, 2);
    }

    public static  void test05(){
        BiPredicate<String,String> biPredicate =(x,y)->x.equals(y);
        biPredicate.test("ff","gg");
    }

    public static  void test06(){
        Function<Integer,String[]> function=(x)->new String[x];
        Function<Integer,String[]> function2=String[]::new;
        function2.apply(10);
    }


}
