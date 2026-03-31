interface Animal {
    // All methods are automatically abstract (No body allowed)
    void makeSound();
    void eat();
}

class Dog implements Animal {
    // You MUST provide the code for every method in the interface
    public void makeSound() {
        System.out.println("Woof!");
    }

    public void eat() {
        System.out.println("Eating bones...");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        d.eat();
    }
}