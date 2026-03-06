public class AbstractModifier {
    public static void main(String[] args) {
        Shape s = new Square();
        s.draw();
    }
}
abstract class Shape {
    abstract void draw();
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing Square");
    }
}
