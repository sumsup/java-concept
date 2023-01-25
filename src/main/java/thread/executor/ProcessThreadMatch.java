package thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProcessThreadMatch {
    public static void main(String[] args) {
        int coreCount = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(coreCount);

        for (int i = 0; i < 100; i++) {
            service.execute(new CpuIntensiveTask(i));
        }

        service.shutdown();
    }

    private static class CpuIntensiveTask implements Runnable {
        int i;
        public CpuIntensiveTask(int i) {
            this.i = i;
        }

        @Override
        public void run() {
            System.out.println("동시에 쓰레드 출력 합니다." + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
