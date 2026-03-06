public class SecureBanking {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount("SAV-99", 5000.0);
        myAccount.displayID();
        myAccount.calculateInterest();
    }
}
abstract class BankAccount {
    private final String accountNumber;
    protected double balance;

    public BankAccount(String id, double initialDeposit) {
        this.accountNumber = id;
        this.balance = initialDeposit;
    }

    public final void displayID() {
        System.out.println("Account ID: " + accountNumber);
    }

    public abstract void calculateInterest();
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String id, double deposit) {
        super(id, deposit);
    }

    public void calculateInterest() {
        double interest = balance * 0.05;
        balance += interest;
        System.out.println("Interest Added: " + interest);
        System.out.println("New Balance: " + balance);
    }
}
