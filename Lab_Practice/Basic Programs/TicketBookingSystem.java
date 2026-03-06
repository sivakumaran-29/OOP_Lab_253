import java.util.Scanner;

public class TicketBookingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int seats = 5;              // Available seats
        boolean ticketBooked = false;

        System.out.println("Menu:");
        System.out.println("1. Book Ticket");
        System.out.println("2. Cancel Ticket");
        System.out.println("3. Check Status");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1: // Book Ticket
                if (seats > 0) {
                    seats--;
                    ticketBooked = true;
                    System.out.println("Ticket booked successfully.");
                } else {
                    System.out.println("Booking failed. No seats available.");
                }
                break;

            case 2: // Cancel Ticket
                if (ticketBooked) {
                    seats++;
                    ticketBooked = false;
                    System.out.println("Ticket cancelled successfully.");
                } else {
                    System.out.println("Cancellation not allowed. No ticket booked.");
                }
                break;

            case 3: // Check Status
                System.out.println("Seats available: " + seats);
                if (ticketBooked) {
                    System.out.println("Ticket Status: Confirmed");
                } else {
                    System.out.println("Ticket Status: Not Booked");
                }
                break;

            case 4: // Exit
                System.out.println("Exiting the system. Thank you!");
                break;

            default: // Invalid choice
                System.out.println("Invalid menu choice. Please try again.");
        }

        sc.close();
    }
}
