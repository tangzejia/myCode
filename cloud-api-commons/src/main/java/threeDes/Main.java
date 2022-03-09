package threeDes;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

public class Main {

    /**
     6      * @param args
     7      */
//    @Slf4j
//      public static void main(String[] args) throws Exception{
//                 String msg = "33";
//                 System.out.println("【加密前】：" + msg);
//
//                 //加密
//                 byte[] secretArr = SecretUtils.encryptMode(msg.getBytes());
//                 System.out.println("【加密后】：" + new String(secretArr));
//
//                 //解密
//                 byte[] myMsgArr = SecretUtils.decryptMode(secretArr);
//                 System.out.println("【解密后】：" + new String(myMsgArr));

          @Test
           public void test(){
//            String key = "xUHdKxzVCbsgVIwTnc1jtpWn";
              String key = "aaaaaaaaaaaaaaaaaaaaaaaa";
            String idcard = "130682199606071234";
            String encode = SecretUtils2.encode3Des(key, idcard);
              System.out.println("原串：" + idcard);
              System.out.println("加密后的串：" + encode);
              System.out.println("解密后的串：" + SecretUtils2.decode3Des(key, encode));
        }



//      }



}
