package dateapi;

import java.time.LocalDateTime;
import java.util.Date;

public class DateThread implements Runnable {
    private boolean stopped = false;
    private Date date = new Date();
    private LocalDateTime localDateTime;

    @Override
    public void run() {
        while(!stopped) {
            System.out.println("현재 날짜 : " + date);
            System.out.println("현재 날짜시각 : " + localDateTime);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("쓰레드 종료");
    }

    public void stop() {
        stopped = true;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

}

class Test1 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.process();
    }

    public void process() {
        DateThread dt = new DateThread();
        Date date = new Date(122, 11, 5, 23, 25, 50);
        LocalDateTime localDateTime = LocalDateTime.of(2022, 12, 24, 23, 50, 20);
        dt.setDate(date);
        dt.setLocalDateTime(localDateTime);
        Thread thread = new Thread(dt);

        date.setTime(60000);
        localDateTime.withDayOfMonth(11);
        thread.start();

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        dt.stop();
    }
}
