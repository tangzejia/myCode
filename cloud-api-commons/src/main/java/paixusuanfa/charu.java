package paixusuanfa;

import java.util.Arrays;

public class charu {
    public static void main(String[] args) {
        int[] arr={1,9,0,-3,200,8,6,99,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public  static void sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for (int j=i;j>0;j--){
                if(arr[j-1]>arr[j]){
                    int tmp;
                    tmp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=tmp;
                }else {
                    break;
                }
            }
        }
    }
}
