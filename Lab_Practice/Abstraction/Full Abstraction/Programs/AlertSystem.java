import java.util.Scanner;

interface Notification {
    void send(String user, String message);
    String getProviderName();
}

class EmailService implements Notification {
    public void send(String user, String message) {
        System.out.println("[SMTP Server] Sending Email to " + user);
        System.out.println("Content: " + message);
    }
    
    public String getProviderName() {
        return "Gmail Enterprise";
    }
}

class SMSService implements Notification {
    public void send(String user, String message) {
        System.out.println("[Telecom Gateway] Sending SMS to " + user);
        System.out.println("Text: " + message);
    }

    public String getProviderName() {
        return "Twilio SMS";
    }
}

public class AlertSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Global Alert Manager ===");
        System.out.println("1. Email Alert | 2. SMS Alert");
        int choice = sc.nextInt();
        
        Notification service;
        if(choice == 1) service = new EmailService();
        else service = new SMSService();

        System.out.print("Recipient: ");
        String name = sc.next();
        System.out.print("Message: ");
        sc.nextLine();
        String msg = sc.nextLine();

        System.out.println("\nUsing Provider: " + service.getProviderName());
        service.send(name, msg);
        
        sc.close();
    }
}
