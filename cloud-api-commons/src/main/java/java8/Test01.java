package java8;



//import cn.hutool.json.JSON;
import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test01 {

    List<Employee> emps = Arrays.asList(
            new Employee(101, "Z3", 19, 9999.99),
            new Employee(102, "L4", 20, 7777.77),
            new Employee(103, "W5", 35, 6666.66),
            new Employee(104, "Tom", 44, 1111.11),
            new Employee(105, "Jerry", 60, 4444.44),
            new Employee(105, "Jerry", 62, 4444.44)
    );

    int num=10;

    @Test
    public void test01(){
        Consumer<String> consumer=a-> System.out.println(a);
        consumer.accept("fff");
    }

    @Test
    public void test02(){
       Runnable runnable=()->{
           System.out.println("nnn"+num);
       };

       new Thread(new Runnable() {
           @Override
           public void run() {

           }
       }).start();
//       thread.start();

    }


     @Test
    public void test03(){
        List<Employee> emps = Arrays.asList(
                new Employee(101, "Z3", 19, 9999.99),
                new Employee(102, "L4", 20, 7777.77),
                new Employee(103, "W5", 35, 6666.66),
                new Employee(104, "Tom", 44, 1111.11),
                new Employee(105, "Jerry", 60, 4444.44),
                new Employee(105, "Jerry", 60, 4444.44)
        );

        Map<Integer, List<Employee>> collect = emps.stream().collect(Collectors.groupingBy(Employee::getAge));
        HashSet<Employee> collect1 = emps.stream().collect(Collectors.toCollection(HashSet<Employee>::new));

//         emps.stream().collect(collectingAn)

        System.out.println(collect1.toString());
    }


    @Test
    public void test04(){

        List<Employee> emps = Arrays.asList(
                new Employee(101, "Z3", 19, 9999.99),
                new Employee(102, "L4", 20, 7777.77),
                new Employee(103, "Tom", 35, 6666.66),
                new Employee(104, "Tom", 44, 1111.11),
                new Employee(105, "Jerry", 60, 4444.44),
                new Employee(105, "Jery", 62, 4444.44)
        );

//        List<Employee> list = emps.stream()
//                .collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Employee::getId))), ArrayList::new));
//        System.out.println(list);
//
//        Map<Integer, Employee> collect = emps.stream().collect(Collectors.toMap(Employee::getId, i -> i, (o, n) -> n));
//        System.out.println(collect);
//
//        emps.stream().filter(str -> !str.name.equals("Jerry")).forEach(System.out::println);;

        

    }

}

