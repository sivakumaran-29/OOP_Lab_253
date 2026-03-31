import java.util.Scanner;

public class NotificationSystem {

    void send(String email, String message) {
        System.out.println("Sending Email to: " + email);
        System.out.println("Content: " + message);
    }

    void send(long phoneNumber, String message, boolean isUrgent) {
        String prefix = isUrgent ? "[URGENT] " : "[Standard] ";
        System.out.println("Sending SMS to: +1-" + phoneNumber);
        System.out.println("Content: " + prefix + message);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NotificationSystem ns = new NotificationSystem();

        System.out.println("Choose Notification Type: (1) Email (2) SMS");
        int choice = input.nextInt();
        input.nextLine(); 

        if (choice == 1) {
            System.out.print("Enter Email: ");
            String mail = input.nextLine();
            System.out.print("Enter Message: ");
            String msg = input.nextLine();
            ns.send(mail, msg);
        } else if (choice == 2) {
            System.out.print("Enter Phone Number: ");
            long phone = input.nextLong();
            input.nextLine(); 
            System.out.print("Enter Message: ");
            String msg = input.nextLine();
            System.out.print("Is it urgent? (true/false): ");
            boolean urgent = input.nextBoolean();
            ns.send(phone, msg, urgent);
        } else {
            System.out.println("Invalid Option.");
        }
        input.close();
    }
}