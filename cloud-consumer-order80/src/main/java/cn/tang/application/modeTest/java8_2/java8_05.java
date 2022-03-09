package cn.tang.application.modeTest.java8_2;


import java.util.function.Function;

public class java8_05 {
    public static void main(String[] args) {

      get(e->{
          System.out.println(Integer.parseInt(e));
          return Integer.parseInt(e);
      });

    }


    public static Integer get(Function<String,Integer> function){
        return function.apply("66");
    }

}
