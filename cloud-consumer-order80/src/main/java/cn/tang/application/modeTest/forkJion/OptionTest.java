package cn.tang.application.modeTest.forkJion;

import java.util.Optional;

public class OptionTest {


    public static void main(String[] args) {
        test02();
    }


    public static void test01(){
        Optional<String> fuck = Optional.of("fuck");
        if(fuck.isPresent()){
            System.out.println(fuck.get());
        }
    }

    public static void test02(){
        Optional<String> s1 = Optional.of("fuck");
        Optional<String> fuck = s1;
       String s= fuck.orElse("ff");

     Optional<String> empty1= Optional.empty();
//     empty.orElse("ff1");

        if(fuck.isPresent()){
            System.out.println(fuck.get());
        }
        if(empty1.isPresent()){
            System.out.println("ll");
        }else {
//            System.out.println(empty.get());
        }

    }
}
