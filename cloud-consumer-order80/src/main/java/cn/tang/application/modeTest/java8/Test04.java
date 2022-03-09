package cn.tang.application.modeTest.java8;

public class Test04 {
    public static void main(String[] args) {
        System.out.println(test(200,x->x*20));
    }

    public static Integer test(Integer n,MyFun myFun){
        return  myFun.getValue(n);
    }
}
