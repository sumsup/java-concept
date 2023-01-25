package dateapi;

import java.util.Calendar;
import java.util.Date;

public class DateAPI {
    public static void main(String[] args) {

        Date date = new Date();

        System.out.println(date);
        System.out.println(date.getMonth());

        Date date1 = new Date(122, 11, 5, 23, 45, 52);

        System.out.println(date1);

        date.setTime(61000);

        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.set(2022, Calendar.DECEMBER, 5, 23, 45, 52);
        Date date2 = calendar.getTime();

        System.out.println(date2);

    }
}
