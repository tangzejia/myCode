package cn.tang.application.modeTest.java8_2;

public interface InterfaceA {

    public  void test();

    public  default  void  test02(){
        System.out.println("llll");
    }
}

class A implements InterfaceA{
    public  void test(){
        System.out.println("gg");
    }

    public static void main(String[] args) {

    }

}
