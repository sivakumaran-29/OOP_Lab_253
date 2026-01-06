import java.util.Scanner;
public class Control_Statements{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean runner = true;
        while(runner){
            System.out.println("Hello User !!!");
            System.out.println("Select the option to proceed further:");
            System.out.println("Click '1' to find whether positive or negative: ");
            System.out.println("Click '2' to find odd or even: ");
            System.out.println("Click '3' to Exit!!!");
            int option = scan.nextInt();

            
            if (option == 1){

                System.out.println("Enter the number to check: ");
                int number = scan.nextInt();
                
                if (number > 0){
                    System.out.println("It's positive number!");
                }
                else{
                    System.out.println("It's negative number!");
                }
            }
            else if(option == 2){

                System.out.println("Enter the number to check: ");
                int number = scan.nextInt();

                if (number % 2 == 0){
                    System.out.println("It's even number");
                }
                else{
                    System.out.println("It's odd number");
                }
            }
            else{
                System.out.println("Operation successful");
                break;
            }

	    	System.out.println("Do you want to continue??(true / false)");	
            runner = scan.nextBoolean();
        }
    }
}