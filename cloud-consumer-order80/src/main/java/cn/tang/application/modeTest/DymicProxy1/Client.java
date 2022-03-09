package cn.tang.application.modeTest.DymicProxy1;


public class Client {
    public static void main(String[] args) {
        IDao dao=new Dao();
        IDao dymicProxy1=(IDao)new DymicProxy1(dao).getTarget();

        dymicProxy1.teach();

    }
}
