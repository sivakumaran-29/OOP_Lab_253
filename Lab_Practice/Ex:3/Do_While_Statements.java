import java.util.Scanner;

public class Do_While_Statements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean runAgain = true;

        do {
            System.out.print("Enter your age: ");
            int age = scan.nextInt();

            if (age >= 18) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You are not eligible to vote.");
            }

            System.out.print("Do you want to check again? (true/false): ");
            runAgain = scan.nextBoolean();

        } while (runAgain);
        System.out.println("Program ended.");
    }
}
