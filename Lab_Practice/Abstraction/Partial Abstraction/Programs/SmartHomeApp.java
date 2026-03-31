import java.util.Scanner;

abstract class SmartDevice {
    String deviceName;

    SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    public void powerOn() {
        System.out.println("[" + deviceName + "] Powering on...");
        System.out.println("[" + deviceName + "] Connecting to Home WiFi...");
        System.out.println("[" + deviceName + "] Status: Online");
    }

    abstract void performAction();

    public void powerOff() {
        System.out.println("[" + deviceName + "] Status: Offline. Goodbye.");
    }
}

class SmartLight extends SmartDevice {
    SmartLight() {
        super("Lumina Smart Bulb");
    }

    @Override
    void performAction() {
        System.out.println(">>> Adjusting brightness to 80%...");
        System.out.println(">>> Setting color temperature to Warm White.");
    }
}

class SmartSpeaker extends SmartDevice {
    SmartSpeaker() {
        super("Echo Audio Pro");
    }

    @Override
    void performAction() {
        System.out.println(">>> Activating Voice Assistant...");
        System.out.println(">>> Playing your 'Morning Jazz' playlist at volume 5.");
    }
}

public class SmartHomeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Home Automation Console ===");
        System.out.println("1. Add Smart Light");
        System.out.println("2. Add Smart Speaker");
        System.out.print("Select Device: ");
        int choice = sc.nextInt();

        SmartDevice myDevice;

        if (choice == 1) {
            myDevice = new SmartLight();
        } else if (choice == 2) {
            myDevice = new SmartSpeaker();
        } else {
            System.out.println("Invalid Selection.");
            return;
        }

        boolean active = true;
        while (active) {
            System.out.println("\n--- Device Menu (" + myDevice.deviceName + ") ---");
            System.out.println("1. Turn On & Connect");
            System.out.println("2. Run Main Action");
            System.out.println("3. Turn Off");
            System.out.println("4. Exit Console");
            System.out.print("Action: ");
            int action = sc.nextInt();

            if (action == 1) {
                myDevice.powerOn();
            } else if (action == 2) {
                myDevice.performAction();
            } else if (action == 3) {
                myDevice.powerOff();
            } else if (action == 4) {
                active = false;
                System.out.println("Exiting Smart Home Console...");
            } else {
                System.out.println("Unknown command.");
            }
        }
        sc.close();
    }
}