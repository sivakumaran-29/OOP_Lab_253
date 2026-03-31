import java.util.Scanner;

interface Payment {
    void process(double amount);
}

interface Identity {
    boolean verifyFingerprint(int code);
}

class DigitalWallet implements Payment, Identity {
    private int savedCode = 1234;

    public boolean verifyFingerprint(int code) {
        return this.savedCode == code;
    }

    public void process(double amount) {
        System.out.println("Wallet Transaction: $" + amount + " successful.");
    }
}

public class SecurePayApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DigitalWallet myWallet = new DigitalWallet();

        System.out.println("=== SecurePay v2.0 ===");
        System.out.print("Scan Fingerprint (Enter 4-digit PIN): ");
        int pin = sc.nextInt();

        if (myWallet.verifyFingerprint(pin)) {
            System.out.println("Identity Verified.");
            System.out.print("Enter Amount to Pay: ");
            double amt = sc.nextDouble();
            myWallet.process(amt);
        } else {
            System.out.println("ACCESS DENIED: Identity Theft Protection Active.");
        }
        
        sc.close();
    }
}