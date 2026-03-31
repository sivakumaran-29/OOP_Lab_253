abstract class Shape {
    String name;

    Shape(String n) { name = n; }

    void showName() {
        System.out.println("Shape: " + name);
    }

    abstract void draw();
}

class Circle extends Shape {
    Circle() { super("Circle"); }

    void draw() {
        System.out.println("Drawing a Round Circle.");
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.showName(); 
        c.draw();     
    }
}