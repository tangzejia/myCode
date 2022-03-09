package cn.tang.application.modeTest.java8;

import java.util.Arrays;
import java.util.List;

public class LamdaTest02 {
    public static void main(String[] args) {


       List<Employee>  e= Arrays.asList(
                new Employee("tt","ff",12),
                new Employee("tt","ff",13),
                new Employee("tt","ff",16)
        );

       e.stream().map(Employee::getAge).forEach(System.out::println);
       e.stream().filter(i->i.getAge()>12)
               .
                              forEach(System.out::println);
    }


}
