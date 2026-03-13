Java Multithreading – Multiple Threads Example

Overview :

This program demonstrates running multiple threads simultaneously.

Two threads are created:

- Thread 1 prints even numbers
- Thread 2 prints odd numbers

Both threads execute concurrently.

---

Steps :

1. Create a class "EvenThread" extending "Thread".
2. Override the "run()" method to print even numbers.
3. Create another class "OddThread" extending "Thread".
4. Override the "run()" method to print odd numbers.
5. Create objects of both threads.
6. Start the threads using "start()".

---

Concepts Used :

- Java Multithreading
- Thread class
- Parallel execution
- "start()" method
- "Thread.sleep()"
