package suanfa2;

public class charu {
    public static void main(String[] args) {

    }


    public static void sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for (int j=i;j>0;j--){
               if(arr[j-1]>arr[j]){
                   int tmp;
                   tmp=arr[j-1];
                   arr[j-1]=arr[j];
                   arr[j]=tmp;

               }else{
                   break;
                }
            }

        }
    }
}
