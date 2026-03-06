public class ProtectedModifier {
    public static void main(String[] args) {
        Child c = new Child();
        c.reveal();
        Parent p = new Parent();
        System.out.println(p.familySecret);
    }
}
class Parent {
    protected String familySecret = "We have a secret recipe.";
}

class Child extends Parent {
    public void reveal() {
        System.out.println("The child says: " + familySecret);
    }
}
