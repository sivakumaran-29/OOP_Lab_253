import java.util.Scanner;

class Ride {
    public double calculateFare(double distance, int minutes) {
        return 0.0;
    }

    public String getRideType() {
        return "Unknown Ride";
    }
}

class StandardRide extends Ride {
    @Override
    public double calculateFare(double distance, int minutes) {
        double baseFare = 5.00;
        return baseFare + (distance * 1.50) + (minutes * 0.25);
    }

    @Override
    public String getRideType() {
        return "Standard Ride";
    }
}

class PremiumRide extends Ride {
    @Override
    public double calculateFare(double distance, int minutes) {
        double baseFare = 15.00;
        return baseFare + (distance * 3.00) + (minutes * 0.50);
    }

    @Override
    public String getRideType() {
        return "Premium Luxury Ride";
    }
}

class CarpoolRide extends Ride {
    @Override
    public double calculateFare(double distance, int minutes) {
        double baseFare = 3.00;
        return baseFare + (distance * 1.00) + (minutes * 0.15);
    }

    @Override
    public String getRideType() {
        return "Shared Carpool Ride";
    }
}

public class RideHailingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean appRunning = true;

        System.out.println("=== Welcome to CityRide ===");

        while (appRunning) {
            System.out.print("\nEnter estimated distance (in miles): ");
            double distance = scanner.nextDouble();
            
            System.out.print("Enter estimated time (in minutes): ");
            int time = scanner.nextInt();

            if (distance <= 0 || time <= 0) {
                System.out.println("Invalid input. Distance and time must be greater than 0.");
                continue;
            }

            System.out.println("\nSelect Ride Category:");
            System.out.println("1. Standard ($5 base, normal rates)");
            System.out.println("2. Premium ($15 base, luxury rates)");
            System.out.println("3. Carpool ($3 base, shared rates)");
            System.out.println("4. Exit App");
            System.out.print("Enter choice (1-4): ");
            
            int choice = scanner.nextInt();
            Ride selectedRide = null;

            if (choice == 1) {
                selectedRide = new StandardRide();
            } else if (choice == 2) {
                selectedRide = new PremiumRide();
            } else if (choice == 3) {
                selectedRide = new CarpoolRide();
            } else if (choice == 4) {
                System.out.println("Closing app. Safe travels!");
                appRunning = false;
                continue;
            } else {
                System.out.println("Invalid selection. Try again.");
                continue;
            }

            double finalFare = selectedRide.calculateFare(distance, time);

            System.out.print("Finding a nearby " + selectedRide.getRideType() + " driver");
            for (int i = 0; i < 4; i++) {
                System.out.print(".");
                try { Thread.sleep(600); } catch (Exception e) { }
            }
            System.out.println();

            System.out.println("Driver Found! Your estimated fare is: $" + String.format("%.2f", finalFare));
            
            System.out.print("\nWould you like to book another ride? (y/n): ");
            String confirm = scanner.next();
            if (confirm.equalsIgnoreCase("n")) {
                System.out.println("Thank you for riding with CityRide!");
                appRunning = false;
            }
        }

        scanner.close();
    }
}