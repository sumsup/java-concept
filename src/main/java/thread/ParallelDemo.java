package thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ParallelDemo {

    private static volatile boolean done = false; // 변수를 cpu 코어 캐시가 아닌 메모리에서 직접 읽고 쓰게 함.

    public static void main(String[] args) {
        Runnable hellos = () -> {
            for (int i = 0; i <= 1000; i++) {
                System.out.println("Hello " + i);
            }
            done = true;
        };

        Runnable goodbye = () -> {
            int i = 1;

            // CPU 최적화 과정에서 아래 라인이 다음과 같이 변경될 수 있다.
            // if(!done) while(true) i++;
            // 그러면 while true가 무한루프가 되면서 다음 출력 라인이 실행이 안될 수 있다.
            // 이걸 막는게 volatile. CPU의 재배치를 막는 명령어 이다.
            while (!done) i++;
            System.out.println("Goodbye " + i);
        };

        Executor executor = Executors.newCachedThreadPool();
        executor.execute(hellos);
        executor.execute(goodbye);

    }
}
