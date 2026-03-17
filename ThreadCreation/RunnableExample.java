package ThreadCreation;

// This class implements Runnable to define a task for a thread
class NumberRunnable implements Runnable {

    // The run() method contains the code that will be executed by the thread
    public void run() {

        // Loop to print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Runnable Interface: " + i);

            try {
                // Pause the thread for 500 milliseconds (0.5 seconds)
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // Handle interruption exception
                System.out.println("Thread interrupted: " + e);
            }
        }
    }
}

public class RunnableExample {

    public static void main(String[] args) {

        // Create object of Runnable implementation
        NumberRunnable obj = new NumberRunnable();

        // Pass Runnable object to Thread
        Thread t1 = new Thread(obj);

        // Start the thread (this calls run() internally)
        t1.start();
    }
}
