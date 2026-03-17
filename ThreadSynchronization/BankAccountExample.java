/* Create BankAccount class
Two threads:
withdraw()
deposit()
Ensure balance remains correct using synchronized.*/
package ThreadSynchronization;



// BankAccount class
class BankAccount {

    int balance = 1000;

    // Deposit method
    public synchronized void deposit(int amount) {

        System.out.println("Depositing: " + amount);

        balance = balance + amount;

        System.out.println("Balance after deposit: " + balance);
    }

    // Withdraw method
    public synchronized void withdraw(int amount) {

        if (balance >= amount) {

            System.out.println("Withdrawing: " + amount);

            balance = balance - amount;

            System.out.println("Balance after withdrawal: " + balance);

        } else {
            System.out.println("Insufficient balance");
        }
    }
}


// Deposit Thread
class DepositThread extends Thread {

    BankAccount account;

    DepositThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.deposit(500);
    }
}


// Withdraw Thread
class WithdrawThread extends Thread {

    BankAccount account;

    WithdrawThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.withdraw(700);
    }
}


public class BankAccountExample {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        DepositThread t1 = new DepositThread(account);
        WithdrawThread t2 = new WithdrawThread(account);

        t1.start();
        t2.start();
    }
}
