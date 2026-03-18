/* Create BankAccount class
Two threads:
withdraw()
deposit()
Ensure balance remains correct using synchronized.*/
package ThreadSynchronization;


public class BankAccountExample {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        DepositThread depositThread = new DepositThread(account);
        WithdrawThread withdrawThread = new WithdrawThread(account);

        depositThread.start();
        withdrawThread.start();
    }
}
