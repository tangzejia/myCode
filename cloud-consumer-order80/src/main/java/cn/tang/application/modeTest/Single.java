package cn.tang.application.modeTest;

public class Single {
    public static void main(String[] args) {
        Single s=Single.getSingle();
        Single s1=Single.getSingle();
        System.out.println(s==s1);

    }

      private Single(){

      }

      private static final Single single= new Single();

     public  static Single getSingle(){
         return single;
     }

}


