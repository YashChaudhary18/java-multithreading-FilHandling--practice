package ThreadSynchronization;

// Shared resource

public class BankAccount {

    private int balance = 1000;

    // Synchronized deposit
    public synchronized void deposit(int amount) {

        System.out.println("Depositing: " + amount);

        balance += amount;

        System.out.println("Balance after deposit: " + balance);
    }

    // Synchronized withdraw
    public synchronized void withdraw(int amount) {

        if (balance >= amount) {

            System.out.println("Withdrawing: " + amount);

            balance -= amount;

            System.out.println("Balance after withdrawal: " + balance);

        } else {
            System.out.println("Insufficient balance");
        }
    }
}