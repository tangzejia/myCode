package paixusuanfa;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MaoPao {


    public static void main(String[] args) {
        int[] a={100,99,98,97,96,95,94,93,92,91,90,89,88,87,86,85,84,83,82,81};
        doPaixu(a);

        for(int s:a){
            System.out.println(s);
        }





    }


    public static void doPaixu(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    echange(arr,j,j+1);
                }

            }
        }
    }
    private static void echange(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
