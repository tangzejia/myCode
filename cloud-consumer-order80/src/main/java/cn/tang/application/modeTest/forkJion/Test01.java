package cn.tang.application.modeTest.forkJion;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Test01 {
    public static void main(String[] args) {
        test();
    }


    public static void test(){
        List<Integer> list=new ArrayList();
        for (Integer i = 0; i < 100000; i++) {
            list.add(i);
        }
        Object o =new Object();
        List<Integer> listParam=new ArrayList();
//        list.parallelStream().forEach(
//                listParam::add
//        );

        IntStream.rangeClosed(0,1000000).parallel().forEach(i->{
            synchronized (o){
                listParam.add(i);
            }
        });
        System.out.println(listParam.size());
    }

}
