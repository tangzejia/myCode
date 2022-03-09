package suanfa2;

import java.util.Arrays;

public class maoPao {
    public static void main(String[] args) {
        int[] a={3,4,66,8,-3,89,20};

        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp;
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }
}
