public class Data_Operators{
	public static void main(String [] args){
   	
	//arithmetic operators

		int num1 = 45;
		int num2 = 5;
		int num3 = 46;
		System.out.println("a = " + num1);
		System.out.println("b = " + num2);

		//addition of two variables
 
		int add = num1 + num2;
  		System.out.println("Addition of numbers: "+ add);

		//subtraction of two numbers

		int sub = num1 - num2;
		System.out.println("Subtraction of numbers: " + sub);

		//multiplication of numbers

		int multiply = num1 * num2;
		System.out.println("Multiplication of numbers: " + multiply);

		//division of numbers

		int div = num1 / num2;
		System.out.println("Division of numbers: " + div);

		//modulus of numbers

		int mod = num1 % num2;
		System.out.println("Modulus of numbers: " + mod);
 
	//Unary operators

		//increment operator
 		num1++;
		System.out.println("Increment operator('a' increased by 1): " + num1);  //number increased by 1

		//decrement operator
 		num2--;
		System.out.println("Decrement operator('b' decreased by 1): " + num2);  //number decreased by 1

	//Relational operators
		
		if(num2 < num1){
			System.out.println("Less than operation successful");
		}
		if(num1 <= num3){
			System.out.println("Less than equal to operation succesful");
		}
		if(num1 > num2){
			System.out.println("Greater than operation successful");
		}
		if (num1 >= num3){
			System.out.println("Greater than or equal operation successful");
		}
		
		if (num2 != num3){
			System.out.println("Not equal to operation successful");
		}

		System.out.println("Is a and c are equal: " + (num1==num3));

	
	//Logical operators		

        // Using AND operator
        if (num1 == num3 && num2 < num1) {
            System.out.println("AND operator runs succesfully");
        }

        // Using OR operator
        if (num1 > num2 || num2 > num3) {
            System.out.println("OR operator runs successfully");
        }

        // Using NOT operator
        boolean result = (num2 > num1);
        if (!result) {
            System.out.println("NOT operator runs successfully");
        }
    }
}
	


		