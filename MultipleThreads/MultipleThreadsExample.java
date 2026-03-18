/* Multiple Threads
Create two threads:
Thread 1 → print even numbers
Thread 2 → print odd numbers*/
package MultipleThreads;

public class MultipleThreadsExample {

    public static void main(String[] args) {

        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        evenThread.start();
        oddThread.start();
    }
}
