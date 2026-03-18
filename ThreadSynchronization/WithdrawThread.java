package ThreadSynchronization;

public class WithdrawThread extends Thread {

    private BankAccount account;

    public WithdrawThread(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {

        for (int i = 0; i < 3; i++) {
            account.withdraw(700);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}