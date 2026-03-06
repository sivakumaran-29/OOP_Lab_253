abstract class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void applyDiscount();
}

class Electronics extends Product {
    public Electronics(String name, double price) {
        super(name, price);
    }

    public void applyDiscount() {
        double finalPrice = price * 0.90;
        System.out.println("Electronics: " + name + " | Original: " + price + " | After 10% Discount: " + finalPrice);
    }
}

class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }

    public void applyDiscount() {
        double finalPrice = price * 0.80;
        System.out.println("Clothing: " + name + " | Original: " + price + " | After 20% Discount: " + finalPrice);
    }
}

public class ECommerceSystem {
    public static void main(String[] args) {
        Product laptop = new Electronics("Laptop", 1000.0);
        Product shirt = new Clothing("T-Shirt", 50.0);

        laptop.applyDiscount();
        shirt.applyDiscount();
    }
}