package MultipleThreads;

// Thread for even numbers
class EvenThread extends Thread {

    public void run() {

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                System.out.println("Even Thread: " + i);
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


// Thread for odd numbers
class OddThread extends Thread {

    public void run() {

        for (int i = 1; i <= 10; i++) {

            if (i % 2 != 0) {
                System.out.println("Odd Thread: " + i);
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


public class MultipleThreadsExample {

    public static void main(String[] args) {

        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();

        t1.start();
        t2.start();
    }
}