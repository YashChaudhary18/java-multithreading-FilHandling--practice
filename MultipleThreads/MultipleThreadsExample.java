package MultipleThreads;

// Generic thread class
class NumberThread extends Thread {

    private String type;

    // Constructor to define thread type (Even / Odd)
    NumberThread(String type) {
        this.type = type;
    }

    @Override
    public void run() {

        // Start from correct number to avoid waste
        int start = type.equals("Even") ? 2 : 1;

        for (int i = start; i <= 10; i += 2) {

            // Print thread name + value
            System.out.println(type + " Thread: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }
    }
}

public class MultipleThreadsExample {

    public static void main(String[] args) {

        // Create threads with different roles
        NumberThread evenThread = new NumberThread("Even");
        NumberThread oddThread = new NumberThread("Odd");

        evenThread.start();
        oddThread.start();
    }
}
