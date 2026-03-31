import java.util.Scanner;

class BankAccount {
    double getInterestRate() {
        return 2.0; 
    }
}

class SavingsAccount extends BankAccount {
    @Override
    double getInterestRate() {
        return 4.5; 
    }
}

class BusinessAccount extends BankAccount {
    @Override
    double getInterestRate() {
        return 1.5; 
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account; 

        System.out.println("Welcome! What type of account are you opening?");
        System.out.println("1. Savings\n2. Business\n3. General");
        int choice = sc.nextInt();

        if (choice == 1) {
            account = new SavingsAccount();
        } else if (choice == 2) {
            account = new BusinessAccount();
        } else {
            account = new BankAccount();
        }

        System.out.println("Your annual interest rate is: " + account.getInterestRate() + "%");
        
        double balance = 1000.0;
        double rate = account.getInterestRate();
        System.out.println("Projection for $1000 deposit:");
        for (int i = 1; i <= 5; i++) {
            balance += (balance * rate / 100);
            System.out.println("Year " + i + ": $" + String.format("%.2f", balance));
        }
        sc.close();
    }
}