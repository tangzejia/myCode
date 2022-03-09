package paixusuanfa;

import java.util.Arrays;

public class xuanze {
    public static void main(String[] args) {

        int[] arr={1,9,0,-3,200,8,6,99,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }



    public static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=  j;
                }
            }
            int tmp;
            tmp=  arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=tmp;
        }
    }
}



