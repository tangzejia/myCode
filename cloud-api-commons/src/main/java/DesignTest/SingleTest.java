package DesignTest;

public class SingleTest {

    private SingleTest(){}

    private static  final  SingleTest singleTest =new SingleTest();

    public static SingleTest  getSingleTest(){
        return  singleTest;
    }


    public static void main(String[] args) {
        SingleTest singleTest1= SingleTest.getSingleTest();
        SingleTest singleTest2= SingleTest.getSingleTest();
        System.out.println(singleTest1==singleTest2);
    }


}
