package DesignTest.celv;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {

       Dog[] a={new Dog(5),new Dog(1),new Dog(4)};
        Cat[] b={new Cat(5),new Cat(1),new Cat(4)};

//        Sorter<Dog> sorter =new Sorter<>();
//        sorter.sort(a,new DogCompartor());

//        Collections.sort();

//        Comparator  c =new CatCompartor();

        Collections.sort(Arrays.asList(b),new CatCompartor());
        System.out.println(Arrays.toString(b));
    }
}
