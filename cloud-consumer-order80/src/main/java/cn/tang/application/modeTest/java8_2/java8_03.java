package cn.tang.application.modeTest.java8_2;

import java.util.Arrays;
import java.util.List;

public class java8_03 {
    public static void main(String[] args) {
        sum((List<Integer> list) -> {
            int s=0;
            for(int i:list){
                s=s+i;
            }
            System.out.println(s);
            return s;
        });
    }

    public static  Integer sum(GetSum getSum) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        return getSum.sum(list);
    }
}
