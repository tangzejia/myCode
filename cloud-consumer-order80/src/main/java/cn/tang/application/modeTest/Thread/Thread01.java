package cn.tang.application.modeTest.Thread;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Thread01 {
    public static void main(String[] args) {
        Runnable r=new Runnable() {
            @Override
            public void run() {
//                log.in
                System.out.println("t");
            }
        };

        Runnable r2=() ->{

//                log.in
            System.out.println("t");

        };

        Thread thread=new Thread(r,"ff");
        thread.start();

    }



}
