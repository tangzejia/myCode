package DesignTest.celv;

public class Cat  {
    public Cat() {
    }

    int food;

    public Cat(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "food=" + food +
                '}';
    }

//    @Override
//    public int compareTo(Cat o) {
//
//        if ((this.food-o.food)>0){
//            return -1;
//        }else if(this.food-o.food<0){
//            return 1;
//        }
//
//        return 0;
//    }
    }
//    @Override
//    public int compareTo(Dog t1, Dog t2) {
//        if ((t1.food-t2.food)>0){
//            return -1;
//        }else if(t1.food-t2.food<0){
//            return 1;
//        }
//
//        return 0;
//    }


//    @Override
//    public int compareTo(Dog o) {
//        if ((this.food-o.food)>0){
//            return -1;
//        }else if(this.food-o.food<0){
//            return 1;
//        }
//
//        return 0;
//    }

