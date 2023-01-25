package dateapi;

import org.joda.time.DateTime;

public class JodaTimeTest {
    public static void main(String[] args) {
        DateTime dateTime = new DateTime(2022, 12, 5, 23, 45, 50);
        System.out.println(dateTime);

        DateTime dateTime1 = dateTime.plusDays(30);
        System.out.println(dateTime1);

    }
}
