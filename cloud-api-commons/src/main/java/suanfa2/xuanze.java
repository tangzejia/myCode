package suanfa2;

import java.util.Arrays;

public class xuanze {
    public static void main(String[] args) {
        int[] a={3,4,66,8,-3,89,20};

        sort(a);
        System.out.println(Arrays.toString(a));

    }


    public static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minindex = i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[minindex]>arr[j]){
                  minindex=j;
                }
            }
                int tmp;
                tmp=arr[minindex];
                arr[minindex]=arr[i];
                arr[i]=tmp;
            }
        }
    }


