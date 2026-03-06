interface Engine {
    void startEngine();
}

class Machine {
    void checkStatus() {
        System.out.println("Machine status: OK");
    }
}

class FactoryMachine extends Machine {
    void produce() {
        System.out.println("Producing goods...");
    }
}

class Robot extends FactoryMachine implements Engine {
    public void startEngine() {
        System.out.println("Robot engine started.");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Robot r = new Robot();
        r.checkStatus();
        r.produce();
        r.startEngine();
    }
}