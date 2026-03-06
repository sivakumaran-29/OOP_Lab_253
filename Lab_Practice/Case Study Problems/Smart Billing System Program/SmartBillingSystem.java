import java.util.Scanner;

public class SmartBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double subTotal = 0;
        String itemName = "";
        
        System.out.println("========== QUICK-BILL POS SYSTEM ==========");
        System.out.println("Type 'exit' as the item name to finish billing.");

        while (true) {
            System.out.print("\nEnter item name: ");
            itemName = sc.next();

            if (itemName.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            if (price > 0 && qty > 0) {
                double total = price * qty;
                subTotal += total;
                System.out.println("Added: " + itemName + " | Sub-cost: " + total);
            } else {
                System.out.println("Invalid input. Price and Quantity must be positive.");
            }
        }

        double tax = subTotal * 0.18; // 18% GST
        double finalBill = subTotal + tax;

        System.out.println("\n===========================================");
        System.out.println("Sub-Total       : " + subTotal);
        System.out.println("Tax (GST 18%)   : " + tax);
        System.out.println("-------------------------------------------");
        System.out.println("FINAL AMOUNT    : " + finalBill);
        System.out.println("===========================================");
        
        sc.close();
    }
}