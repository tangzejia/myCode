package cn.tang.application.modeTest.DymicProxy1;

public class Dao implements  IDao {
    @Override
    public void teach() {
        System.out.println("dao 运行");
    }
}
