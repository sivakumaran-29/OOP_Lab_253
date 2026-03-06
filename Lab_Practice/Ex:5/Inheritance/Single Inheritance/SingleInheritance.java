class Device {
    void startup() {
        System.out.println("Device is starting...");
    }
}

class Laptop extends Device {
    void login() {
        System.out.println("User logged into laptop.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop();
        myLaptop.startup();
        myLaptop.login();
    }
}