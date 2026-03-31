public class OverloadingDemo {
  
    void display(int a, int b) {
        System.out.println("Arguments: " + a + " and " + b);
    }
  
    void display(double a) {
        System.out.println("Argument: " + a);
    }

    public static void main(String[] args) {
        OverloadingDemo obj = new OverloadingDemo();
        
        obj.display(10, 20); 
        obj.display(5.5);    
    }
}