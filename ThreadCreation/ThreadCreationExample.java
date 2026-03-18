package ThreadCreation;

public class ThreadCreationExample {

    public static void main(String[] args) {

        // Using Thread class
        NumberThread thread1 = new NumberThread();

        // Using Runnable
        Thread thread2 = new Thread(new NumberRunnable());

        // Start both threads
        thread1.start();
        thread2.start();
    }
}