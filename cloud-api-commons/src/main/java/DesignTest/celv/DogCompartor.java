package DesignTest.celv;

public class DogCompartor implements  Compartor<Dog> {
    public int compareTo(Dog t1, Dog t2) {
        if ((t1.food-t2.food)>0){
            return -1;
        }else if(t1.food-t2.food<0){
            return 1;
        }

        return 0;
    }
}
