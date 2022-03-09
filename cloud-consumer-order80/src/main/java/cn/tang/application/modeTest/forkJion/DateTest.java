package cn.tang.application.modeTest.forkJion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTest {
    public static void main(String[] args) {
        test();

    }

    public static void test(){
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy- MM-dd HH:mm:ss");

        LocalDateTime localDate1 = LocalDateTime.parse("1997-05-06 22:45:16",dateTimeFormatter);
        System.out.println(localDate1);
    }

}
