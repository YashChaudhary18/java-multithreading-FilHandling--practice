package ThreadCreation;

// This class extends Thread to create a custom thread
class NumberThread extends Thread {

    // The run() method contains the task that the thread will execute
    @Override
    public void run() {

        // Loop to print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {

            // Print current thread name along with number
            System.out.println(Thread.currentThread().getName() + ": " + i);

            try {
                // Pause execution for 500 milliseconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // Handle interruption exception
                System.out.println("Thread interrupted: " + e);
            }
        }
    }
}

public class ThreadExample {

    public static void main(String[]
