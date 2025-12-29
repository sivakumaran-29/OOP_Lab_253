public class Data_types{
	public static void main(String [] args){

		//here we are declaring the variables for school enrollment details

		int roll_no , pay_form_no;
		float balance;
		double amt_paid , scholarship_amt;
		boolean paid;
		
		//assigning the values to the assigned variables

		roll_no = 25253;
		pay_form_no = 125;
		amt_paid = 350000;
		scholarship_amt = 150000;
		paid = true;
		balance = 15.2f;
 
		//printing the details to the user

		System.out.println("roll_no: " + roll_no);
		System.out.println("pay_form_no: "+ pay_form_no);
		System.out.println("amt_paid: " + amt_paid);
		System.out.println("scholarship_amt: " + scholarship_amt);
		System.out.println("Is the amount paid : " + paid);
		System.out.println("Balance amount : " + balance);
	}
}
