package cn.tang.application.modeTest.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Thread02  {
    public static void main(String[] args)  throws Exception{
        FutureTask<String> task=new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                return "100";
            }
        });

        Thread thread =new Thread(task,"t02");
        thread.start();
        System.out.println(task.get());
    }
}
