package Workshop;

public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else  {
            System.out.println("Insufficient balance");
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}
