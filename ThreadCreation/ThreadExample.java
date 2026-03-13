package ThreadCreation;

class NumberThread extends Thread {

    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread Class: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadExample {

    public static void main(String[] args) {

        NumberThread t1 = new NumberThread();

        t1.start(); // start thread
    }
}
