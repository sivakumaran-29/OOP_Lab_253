public class PublicModifier {
    public static void main(String[] args) {
        World obj = new World();
        System.out.println(obj.message);
        obj.display();
    }
}
class World {
    public String message = "Hello, I am accessible everywhere!";
    
    public void display() {
        System.out.println(message);
    }
}
