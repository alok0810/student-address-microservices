import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestExectorService {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //run method is runnable
        Runnable aTask1 = () -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Task 1 is running");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task 1 is completed");
        };
        Runnable aTask2 = () -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Task 2 is running");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task 2 is completed");
        };
        Runnable aTask3 = () -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Task 3 is running");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task 3 is completed");
        };

        executorService.submit(aTask1);
        executorService.submit(aTask2);
        executorService.submit(aTask3);
        executorService.shutdown();



    }
}
