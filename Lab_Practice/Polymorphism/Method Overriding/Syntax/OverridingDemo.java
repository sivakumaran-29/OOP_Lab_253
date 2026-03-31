class Parent {
    void show() {
        System.out.println("Parent's show() executed");
    }
}

class Child extends Parent {
    
    @Override
    void show() {
        System.out.println("Child's show() executed");
    }
}

public class OverridingDemo{
    public static void main(String[] args) {
        
        Parent obj = new Child(); 
        
        obj.show(); 
    }
}