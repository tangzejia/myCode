package cn.tang.application.modeTest;

public class LazySingle {
//双重检测
    private static  volatile  LazySingle lazySingle;

    private LazySingle(){}

    public static synchronized LazySingle getInstance(){
        if(lazySingle ==null){
            synchronized (LazySingle.class){
                if (lazySingle==null){
                    lazySingle= new LazySingle();
                }
            }
        }
        return  lazySingle;
    }

    public static void main(String[] args) {
        LazySingle s=LazySingle.getInstance();
        LazySingle s1=LazySingle.getInstance();
        System.out.println(s==s1);

    }


}
