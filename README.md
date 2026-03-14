Java Multithreading & File Handling Practice

This repository contains practice programs demonstrating Java Multithreading concepts, File Handling operations, and a simple Java logging mini project.

The programs are organized into folders based on the concept being practiced.

---

Topics Covered

Multithreading Practicals

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

A thread prints numbers 1 → 5 with a 1 second pause between each number.

---

4. Thread Synchronization

Implements a BankAccount example.

Two threads perform:

- Deposit
- Withdraw

"synchronized" ensures the balance remains correct.

---

File Handling Practicals

5. Write File

Write student details into:

students.txt

---

6. Read File

Read and print the contents of:

students.txt

---

7. Append File

Add new student records to an existing file without deleting previous data.

---

8. CSV File Reader

Read data from:

students.csv

and print all records.

---

Mini Project

9. Log System

A simple logging system that records actions in:

app.log

Example log entries:

Employee added
Employee deleted

Each action is stored with a timestamp.

---

Project Structure

java-multithreading-practice
│
├── FileHandling
│   ├── WriteStudentFile.java
│   ├── ReadStudentFile.java
│   ├── AppendStudentFile.java
│   ├── CSVFileReader.java
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
├── Logging
│   ├── LogSystem.java
│   └── Readme.md
│
└── README.md

---

Technologies Used

- Java
- Multithreading
- File Handling
- Object-Oriented Programming

---

Purpose of This Repository

This repository is created to practice core Java concepts related to multithreading and file handling and to implement small practical programs for better understanding of concurrent programming and file operations.

---
