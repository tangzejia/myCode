package cn.tang.application.modeTest.java8_2;

public class java8_01 {

    public static void main(String[] args) {
        new Thread(new Runnable(){
          public void run(){
              System.out.println("ff");
          }
        }).start();

        new Thread(()-> System.out.println("gg"+ Thread.currentThread().getName())).start();


        goShow(new UserService() {
            @Override
            public void show() {
                System.out.println("mmmmmmm");
            }
        });

        goShow(()-> System.out.println("ffffff"));

    }


    public static void  goShow(UserService userService){
        userService.show();
    }
}

