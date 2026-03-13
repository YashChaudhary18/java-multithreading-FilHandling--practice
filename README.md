# java-multithreading-FilHandling--practice

Java Multithreading & File Handling Practice

This repository contains practice programs demonstrating Java Multithreading concepts and File Handling.

Each concept is organized in a separate folder with its own example and explanation.

---

Topics Covered :

1. Thread Creation

Create threads using:

- Thread class
- Runnable interface

Program prints numbers from 1 to 10.

---

2. Multiple Threads

Two threads running simultaneously:

- Thread 1 → prints even numbers
- Thread 2 → prints odd numbers

---

3. Thread Sleep

Demonstrates "Thread.sleep()".

A thread prints numbers 1 to 5 with a 1 second pause between each number.

---

4. Thread Synchronization

Implements a BankAccount example.

Two threads perform:

- Deposit
- Withdraw

"synchronized" keyword ensures the balance remains correct and prevents race conditions.

---

5. File Handling

Demonstrates writing data into a file.

Student details are written into:

students.txt

---

Project Structure :

java-multithreading-practice
│
├── FillHandling
│   ├── WriteStudentFile.java
│   └── Readme.md
│
├── MultipleThreads
│   ├── MultipleThreadsExample.java
│   └── Readme.md
│
├── ThreadCreation
│   ├── ThreadExample.java
│   ├── RunnableExample.java
│   └── Readme.md
│
├── ThreadSleep
│   ├── ThreadSleepExample.java
│   └── Readme.md
│
├── ThreadSynchronization
│   ├── BankAccountExample.java
│   └── Readme.md
│
└── README.md

---

Technologies Used :

- Java
- Multithreading
- File Handling
- Object-Oriented Programming

---

Purpose of This Repository :

This repository is created to practice core Java concepts related to multithreading and file handling.

These concepts are commonly used in Java backend development and concurrent programming.

