package dateapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JavaTimeThread {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2022, 12, 25);

        System.out.println(localDate);

        LocalTime localTime = LocalTime.of(23, 45, 50);

        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        System.out.println(localDateTime);

    }
}
