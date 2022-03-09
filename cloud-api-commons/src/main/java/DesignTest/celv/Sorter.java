package DesignTest.celv;





//import java.util.Comparator;

//import static cn.hutool.core.util.ArrayUtil.swap;

public class Sorter<T> {

    public void sort(T array[], Compartor comparable){
        for (int i = 0; i <array.length-1 ; i++) {
            int minPos = i;
            for (int j = i+1; j < array.length; j++) {
                minPos =comparable.compareTo(array[j],array[minPos])==-1?j:minPos;
            }
//            swap(array,i,minPos);
        }
    }
}
