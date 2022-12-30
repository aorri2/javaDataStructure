package executor;

import java.util.concurrent.*;

public class ExecutorSample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //        executor();
        System.out.println(executorService());
    }

    private static void executor() {
        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> System.out.println("hello"));
    }

    private static String executorService() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<String> future = executorService.submit(() -> "Hello World");
        String result = future.get();
        return result;
    }
}
