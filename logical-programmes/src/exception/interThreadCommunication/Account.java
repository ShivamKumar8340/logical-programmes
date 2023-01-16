package exception.interThreadCommunication;

public class Account {
    int amount = 10000;

    synchronized void withdraw(int amount) {
        System.out.println("going to withdraw.............");

        if (this.amount < amount) {
            System.out.println("less balance, waiting for withdraw");

            try {
                wait();
            } catch (Exception e) {}

        }
        this.amount-=amount;
        System.out.println("balance withdraw");
    }

    synchronized void deposit(int amount) {
        System.out.println("going to deposit");
        this.amount+=amount;
        System.out.println("deposit completed");
        notify();
    }
}
