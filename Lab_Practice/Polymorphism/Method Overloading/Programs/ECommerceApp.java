import java.util.Scanner;

class PaymentGateway {
    
    public void pay(double amount) {
        System.out.println("Processing Wallet Payment...");
        simulateNetworkDelay();
        System.out.println("SUCCESS: $" + amount + " deducted from your Wallet.");
    }

    public void pay(double amount, String upiId) {
        System.out.println("Processing UPI Payment for ID: " + upiId + "...");
        simulateNetworkDelay();
        System.out.println("SUCCESS: $" + amount + " paid via UPI.");
    }

    public void pay(double amount, String cardNumber, int cvv) {
        
        if (cvv < 100 || cvv > 999) {
            System.out.println("FAILED: Invalid CVV. Transaction declined.");
        } else {
            System.out.println("Processing Card ending in " + cardNumber.substring(cardNumber.length() - 4) + "...");
            simulateNetworkDelay();
            System.out.println("SUCCESS: $" + amount + " charged to Credit Card.");
        }
    }

    private void simulateNetworkDelay() {
        System.out.print("Connecting to bank");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            try { Thread.sleep(500); } catch (Exception e) { } 
        }
        System.out.println(); 
    }
}


public class ECommerceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentGateway gateway = new PaymentGateway();
        
        boolean keepShopping = true;
        double cartTotal = 250.75; 
        System.out.println("=== Welcome to TechStore Checkout ===");
        System.out.println("Your cart total is: $" + cartTotal);

        while (keepShopping) {
            System.out.println("\nSelect Payment Method:");
            System.out.println("1. App Wallet");
            System.out.println("2. UPI / NetBanking");
            System.out.println("3. Credit / Debit Card");
            System.out.println("4. Cancel Order & Exit");
            System.out.print("Enter choice (1-4): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                
                gateway.pay(cartTotal); 
                keepShopping = false; 
                
            } else if (choice == 2) {
                System.out.print("Enter your UPI ID (e.g., user@bank): ");
                String upi = scanner.nextLine();
                
                gateway.pay(cartTotal, upi); 
                keepShopping = false;
                
            } else if (choice == 3) {
                System.out.print("Enter 16-digit Card Number: ");
                String cardNum = scanner.nextLine();
                System.out.print("Enter 3-digit CVV: ");
                int cvv = scanner.nextInt();
                
                gateway.pay(cartTotal, cardNum, cvv); 
                
                
                if (cvv >= 100 && cvv <= 999) {
                    keepShopping = false; 
                }
                
            } else if (choice == 4) {
                System.out.println("Order cancelled. Returning to home screen.");
                keepShopping = false; 
                
            } else {
                System.out.println("Invalid selection. Please try again.");
            }
        }
        
        System.out.println("Thank you for visiting TechStore!");
        scanner.close();
    }
}