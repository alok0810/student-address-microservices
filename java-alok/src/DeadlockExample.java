public class DeadlockExample {

    // Two shared resources
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {

        // Thread 1 locks resource1 then tries to lock resource2
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: locked resource 1");

                // Sleep to simulate work and give Thread 2 a chance to lock resource2
                try { Thread.sleep(100); } catch (InterruptedException e) { }

                System.out.println("Thread 1: waiting to lock resource 2");
                synchronized (resource2) {
                    System.out.println("Thread 1: locked resource 2");
                }
            }
        });

        // Thread 2 locks resource2 then tries to lock resource1
        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: locked resource 2");

                try { Thread.sleep(100); } catch (InterruptedException e) { }

                System.out.println("Thread 2: waiting to lock resource 1");
                synchronized (resource1) {
                    System.out.println("Thread 2: locked resource 1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
