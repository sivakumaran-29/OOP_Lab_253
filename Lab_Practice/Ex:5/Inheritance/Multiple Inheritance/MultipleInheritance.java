interface Camera {
    void click();
}

interface Phone {
    void call();
}

class SmartDevice implements Camera, Phone {
    public void click() {
        System.out.println("Photo captured.");
    }
    public void call() {
        System.out.println("Call connected.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        SmartDevice sd = new SmartDevice();
        sd.click();
        sd.call();
    }
}