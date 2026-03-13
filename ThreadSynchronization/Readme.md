Java Thread Synchronization Example

Overview :

This program demonstrates thread synchronization in Java using the "synchronized" keyword.

Two threads interact with the same "BankAccount" object:

- One thread deposits money
- Another thread withdraws money

Synchronization ensures that only one thread modifies the balance at a time.

---

Steps :

1. Create a "BankAccount" class with a balance variable.
2. Create synchronized methods:
   - "deposit()"
   - "withdraw()"
3. Create two threads:
   - "DepositThread"
   - "WithdrawThread"
4. Both threads operate on the same bank account object.
5. Use the "synchronized" keyword to ensure thread-safe operations.

---

Concepts Used :

- Java Multithreading
- Thread Synchronization
- "synchronized" keyword
- Race condition prevention
