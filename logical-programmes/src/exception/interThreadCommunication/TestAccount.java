package exception.interThreadCommunication;

public class TestAccount {
    public static void main(String[] args) {
        final Account account = new Account();

        new Thread() {
            public void run() {
                account.withdraw(19000);
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                account.deposit(1000);
            }
        }.start();
    }
}
