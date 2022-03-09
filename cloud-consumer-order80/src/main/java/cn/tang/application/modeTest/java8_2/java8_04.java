package cn.tang.application.modeTest.java8_2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class java8_04 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);


        long count = list.stream().count();

        getSum(()->{
            int s=0;
            for (Integer i:list){
                s=s+i;
            }
            System.out.println(s);
            return s;
        });

        getSum2(e1-> {
            System.out.println(e1.toUpperCase());
        },e2->{
            System.out.println(e2.toLowerCase());
        });


    }


    public static Integer getSum(Supplier<Integer> t){
       return t.get();
    }

    public static void getSum2(Consumer<String> t1,Consumer<String> t2){
//         t1.accept("helloWWW");
//         t2.accept("helloWWW");
        t2.andThen(t1).accept("helloWWW");
    }


}
