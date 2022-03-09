package suanfa.MaoPao;

public class MaoPao {

    public static void main(String[] args) {
       int[] a={3,4,66,8};
       compar(a);

       for (int s:a){
           System.out.println(s);
       }

    }


    private static void kuisu(Comparable[] a){

    }

    private static  void  com(Comparable[] a){
            for(int i=a.length-1;i>0;i--){
                for(int j=0;j<i;j++){
                    geater(a[j],a[j+1]);
                    echange(a,j,j+1);
                }
            }
    }

    private static boolean geater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }


    private static void echange(Comparable[] a,int i,int j){
        Comparable temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static  void compar(int[] a){
        for(int i= a.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                int temp;
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }


    public static  void select(int[] a){
        for(int i=0;i< a.length-2;i++){
            int minIndex = i;
            for(int j=i+1;j<a.length;j++){
                int temp;
                if(a[j]>a[j+1]){

                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }

}



