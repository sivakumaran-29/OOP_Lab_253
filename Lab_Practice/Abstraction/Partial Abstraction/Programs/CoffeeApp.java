import java.util.Scanner;

abstract class CoffeeMachine {
    String modelName;

    CoffeeMachine(String modelName) {
        this.modelName = modelName;
    }

    public void boilWater() {
        System.out.println("[" + modelName + "] Boiling water to 95°C...");
    }

    abstract void brewRecipe();

    public void selfClean() {
        System.out.println("[" + modelName + "] Cleaning nozzles with steam...");
        System.out.println("Machine is ready for the next cup!");
    }

    public final void makeCoffee() {
        boilWater();
        brewRecipe();
        selfClean();
    }
}

class EspressoMachine extends CoffeeMachine {
    EspressoMachine() {
        super("Premium Espresso Maker");
    }

    @Override
    void brewRecipe() {
        System.out.println(">>> Pressurizing 9 bars of steam through fine grounds.");
        System.out.println(">>> Result: Rich, dark Espresso shot.");
    }
}

class LatteMachine extends CoffeeMachine {
    LatteMachine() {
        super("Automatic Latte Maker");
    }

    @Override
    void brewRecipe() {
        System.out.println(">>> Mixing steamed milk with a shot of espresso.");
        System.out.println(">>> Result: Smooth, creamy Caffe Latte.");
    }
}

public class CoffeeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean powerOn = true;

        System.out.println("=== Smart Coffee Hub ===");

        while (powerOn) {
            System.out.println("\nAvailable Drinks:");
            System.out.println("1. Strong Espresso");
            System.out.println("2. Creamy Latte");
            System.out.println("3. Power Off");
            System.out.print("Select your caffeine: ");

            int choice = scanner.nextInt();
            CoffeeMachine selectedMachine = null;

            if (choice == 1) {
                selectedMachine = new EspressoMachine();
            } else if (choice == 2) {
                selectedMachine = new LatteMachine();
            } else if (choice == 3) {
                System.out.println("Shutting down... Goodbye!");
                powerOn = false;
                continue;
            } else {
                System.out.println("Error: Selection not available.");
                continue;
            }

            System.out.println("\n--- Starting Brew Cycle ---");
            selectedMachine.makeCoffee();
            System.out.println("---------------------------");

            System.out.print("\nWould you like another cup? (y/n): ");
            String again = scanner.next();
            if (again.equalsIgnoreCase("n")) {
                powerOn = false;
                System.out.println("Have a productive day!");
            }
        }
        scanner.close();
    }
}