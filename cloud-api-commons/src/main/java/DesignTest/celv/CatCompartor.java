package DesignTest.celv;

import java.util.Comparator;

public class CatCompartor implements Comparator<Cat> {
    @Override
    public int compare(Cat t1, Cat t2) {
        if ((t1.food-t2.food)<0){
            return -1;
        }else if(t1.food-t2.food>0){
            return 1;
        }

        return 0;
    }
//    public int compareTo(Dog t1, Dog t2) {
//        if ((t1.food-t2.food)>0){
//            return -1;
//        }else if(t1.food-t2.food<0){
//            return 1;
//        }
//
//        return 0;
//    }
}
