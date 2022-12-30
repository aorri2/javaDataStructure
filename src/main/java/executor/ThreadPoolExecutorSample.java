package executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutorSample {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);
        executor.submit(()->{
            Thread.sleep(1000);
            return null;
        });executor.submit(()->{
            Thread.sleep(1000);
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(1000);
            return null;
        });

        System.out.println("executor pool size is "+executor.getPoolSize());
        System.out.println("executor Queue size is "+executor.getQueue().size());
    }
}
