package cn.tang.application.modeTest.java8;

import java.util.*;

public class LamdaTest {





    public static void main(String[] args) {
        test1();

    }

//    public void test02(e,new MyPardict<Employee>){
//
//    }


    public static void test1(){

        List<Employee>  e= Arrays.asList(
                new Employee("tt","ff",17),
                new Employee("tt","ff",12),
                new Employee("tt","ff",13),
                new Employee("tt","ff",29),
                new Employee("tt","ff",16)
        );



        Collections.sort(e,new Comparator<Employee>(){
            public int compare(Employee o1, Employee o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        System.out.println(e);

    }
}
