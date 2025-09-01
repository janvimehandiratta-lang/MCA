public class VolatileDemo {

    // Volatile variable shared between threads
    private static volatile boolean running = true;

    public static void main(String[] args) {
        // Thread 1: Continuously runs until 'running' becomes false
        Thread worker = new Thread(() -> {
            System.out.println("Worker thread started...");
            while (running) {
                // Simulate work
            }
            System.out.println("Worker thread stopped.");
        });

        worker.start();

        // Sleep in main thread for 2 seconds then stop the worker
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Change the value of the volatile variable
        running = false;
        System.out.println("Main thread changed 'running' to false.");
    }
}
