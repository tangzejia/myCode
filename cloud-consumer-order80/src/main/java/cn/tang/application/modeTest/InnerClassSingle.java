package cn.tang.application.modeTest;

public class InnerClassSingle {
//静态内部类
    private  InnerClassSingle(){}
    private  static InnerClassSingle innerClassSingle;

    private static class  Inclass{
        private  static  final InnerClassSingle innerClassSingle =new InnerClassSingle();
    }

    public static  synchronized InnerClassSingle getInstance(){
        return innerClassSingle;
    }

}
