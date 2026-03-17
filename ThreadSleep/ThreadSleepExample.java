/* Thread Sleep Example
Create thread printing:
1 → 5
Pause 1 second between numbers.*/
package ThreadSleep;



class SleepThread extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Number: " + i);

            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadSleepExample {

    public static void main(String[] args) {

        SleepThread t1 = new SleepThread();

        t1.start();
    }
}
