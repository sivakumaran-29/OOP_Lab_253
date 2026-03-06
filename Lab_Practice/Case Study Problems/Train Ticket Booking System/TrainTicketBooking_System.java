import java.util.Scanner;

public class TrainTicketBooking_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalSeats = 15;
        int myTickets = 0;
        double pricePerTicket = 450.0;
        int choice = 0;

        System.out.println("========================================");
        System.out.println("    WELCOME TO VOLVO EXPRESS RAIL       ");
        System.out.println("========================================");

        while (choice != 4) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Book Tickets");
            System.out.println("2. Cancel Tickets");
            System.out.println("3. Check My Account");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("\nAvailable Seats: " + totalSeats);
                System.out.print("Number of tickets to book: ");
                int count = sc.nextInt();

                if (count <= 0) {
                    System.out.println(">> Error: Please enter a valid number of seats.");
                } else if (count <= totalSeats) {
                    totalSeats = totalSeats - count;
                    myTickets = myTickets + count;
                    double totalCost = count * pricePerTicket;
                    
                    System.out.println(">> SUCCESS: " + count + " Seats Reserved.");
                    System.out.println(">> Total Fare: Rs." + totalCost);
                } else {
                    System.out.println(">> SORRY: Only " + totalSeats + " seats are left.");
                }
            } 
            else if (choice == 2) {
                if (myTickets > 0) {
                    System.out.println("\nYou have " + myTickets + " active tickets.");
                    System.out.print("Number of tickets to cancel: ");
                    int cancelCount = sc.nextInt();

                    if (cancelCount > 0 && cancelCount <= myTickets) {
                        myTickets = myTickets - cancelCount;
                        totalSeats = totalSeats + cancelCount;
                        System.out.println(">> CANCELLED: " + cancelCount + " tickets. Refund initiated.");
                    } else {
                        System.out.println(">> ERROR: You cannot cancel more than " + myTickets + " tickets.");
                    }
                } else {
                    System.out.println(">> NOTICE: No active bookings found.");
                }
            } 
            else if (choice == 3) {
                System.out.println("\n----------- ACCOUNT SUMMARY -----------");
                System.out.println("Tickets Owned   : " + myTickets);
                System.out.println("Balance Paid    : Rs." + (myTickets * pricePerTicket));
                System.out.println("Seats in Train  : " + totalSeats + " (Remaining)");
                System.out.println("---------------------------------------");
            } 
            else if (choice == 4) {
                System.out.println("\nExiting... Thank you for choosing Volvo Express!");
            } 
            else {
                System.out.println(">> INVALID: Please select a choice between 1 and 4.");
            }
        }
        
        sc.close();
    }
}