package xiancheg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.FutureTask;

public class Test01 {

    public static void main(String[] args) {
//        Map map=new ConcurrentHashMap();
    new Thread(new FutureTask<String>(new Mythread())).start();

    List list=new CopyOnWriteArrayList<>();
    List list1= Collections.synchronizedList(new ArrayList<>());

    }
}

class  Mythread implements Callable<String>{
    @Override
    public String call() throws Exception {
        System.out.println("gg");
        return "f";
    }
}




