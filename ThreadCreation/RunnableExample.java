package ThreadCreation;

class NumberRunnable implements Runnable {

    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Runnable Interface: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class RunnableExample {

    public static void main(String[] args) {

        NumberRunnable obj = new NumberRunnable();

        Thread t1 = new Thread(obj);

        t1.start(); // start thread
    }
}