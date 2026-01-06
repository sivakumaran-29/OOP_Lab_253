import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("How many calculations do you want to perform? ");
        int times = scan.nextInt();

        for (int i = 1; i <= times; i++) {
            System.out.println("Simple Calculator!!!");

            System.out.print("Enter first number: ");
            double num1 = scan.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scan.nextDouble();

            System.out.println("Choose operation:");
            System.out.println("1. Add  2. Subtract  3. Multiply  4. Divide");
            System.out.print("Enter choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;
                default:
                    System.out.println("Invalid operation!");
            }
        }

        scan.close();
        System.out.println("\nAll calculations completed.");
    }
}
