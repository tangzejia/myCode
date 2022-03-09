package cn.tang.application.modeTest.java8;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTest {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;
        LocalDateTime localDateTime= LocalDateTime.now();
//        System.out.println(localDateTime.parse());
        System.out.println(Instant.now().toEpochMilli());
    }
}
