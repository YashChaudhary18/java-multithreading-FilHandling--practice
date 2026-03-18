package ThreadSynchronization;

public class DepositThread extends Thread {

    private BankAccount account;

    public DepositThread(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {

        for (int i = 0; i < 3; i++) {
            account.deposit(500);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}