package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RuntimeDemo {

    public static void main(String[] args) {
        Runnable hellos = () -> {
            for (int i = 1; i <= 1000; i++) {
                System.out.println("Hello " + i);
            }
        };
        Runnable goodbyes = () -> {
            for (int i = 1; i <= 1000; i++) {
                System.out.println("GoodBye " + i);
            }
        };

        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(hellos);
        executor.execute(goodbyes);
        executor.shutdown();
    }
}
