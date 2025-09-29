import java.util.concurrent.*;

class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("kkkkkkkk");
        // Task logic here
        Thread.sleep(2000);
        return "Asynchronous task completed in thread: " + Thread.currentThread().getName();
    }
}

public class FutureThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        MyCallable task = new MyCallable();
        Future<String> future = executorService.submit(task);
        System.out.println("Main thread continues to execute.");
       String result = future.get(); // Get the result (blocks until complete)
        System.out.println("lllllll");
        System.out.println(result);
        executorService.shutdown();
    }
}