package paixusuanfa;

import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Person person1=new Person(2,"ff");
        Person person2=new Person(3,"ff");

        Comparable max = getMax(person1, person2);

        int compare = Integer.compare(1, 2);
        System.out.println(max);
    }

    public  static Comparable getMax(Comparable c1,Comparable c2){
        int i = c1.compareTo(c2);
        if(i>0){
            return c1;
        }else {
            return  c2;
        }
    }

}
