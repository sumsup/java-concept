package dateapi;

import org.joda.time.DateTime;

import java.time.*;
import java.util.Date;

public class DateAPIConvert {
    public static void main(String[] args) {
        // Date to LocalDateTime. || to LocalDate.
        // #1-1. Using Instant. To 'LocalDateTime'
        Date instantDate = new Date();
        LocalDateTime localDateTime1 = instantDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println(localDateTime1);

        // #1-2. Using Instant. to 'LocalDate'
        LocalDate localDate1 = instantDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(localDate1);

        // #2-1. Using java.sql.Timestamp. to 'LocalDateTime'
        Date timestampDate = new Date();
        LocalDateTime localDateTime2 = new java.sql.Timestamp(timestampDate.getTime()).toLocalDateTime();
        System.out.println(localDateTime2);

        // #2-2. Using java.sql.Date. to 'LocalDate'
        LocalDate localDate2 = new java.sql.Date(timestampDate.getTime()).toLocalDate();
        System.out.println(localDate2);

        // LocalDateTime || LocalDate to Date.
        // #3-1. java.sql.Timestamp.valueOf() => java.util.Date.
        LocalDateTime localDateTime = LocalDateTime.now();
        Date javaUtilDate = java.sql.Timestamp.valueOf(localDateTime); // java.sql 패키지 이지만 java.util.Date로 변환한다.
        System.out.println(javaUtilDate);

        // #3-2. java.util.Date.from() => java.util.Date.
        Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
        Date date = Date.from(instant);
        System.out.println(date);

        // 이렇게 Date <-> LocalDateTime, LocalDate 사이 중간 객체로 Instant를 이용하여 변환한다.

        // joda <-> java.util.Date 나 joda <-> LocalDate. LocalDateTime.
        Date date1 = new Date();
        DateTime dateTime = new DateTime(date1);
        System.out.println(dateTime);

        Date date2 = dateTime.toDate();
        System.out.println(date2);

        // LocalDate <-> DateTime. 은? Instant로 변환해서 convert.
        // LocalDateTime -> Instant -> DateTime.
        Instant instant1 = localDateTime1.atZone(ZoneId.systemDefault()).toInstant();
        DateTime dateTime1 = new DateTime(instant1.toEpochMilli());
        System.out.println(dateTime1);

    }
}
