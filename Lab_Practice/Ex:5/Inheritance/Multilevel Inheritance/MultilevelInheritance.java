class Vehicle {
    void move() {
        System.out.println("Vehicle is moving.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven.");
    }
}

class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric car is charging.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.move();
        tesla.drive();
        tesla.charge();
    }
}