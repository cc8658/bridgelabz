import java.util.Scanner;
class Discountinput{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Fee: ");
		int fee = scan.nextInt();
		System.out.print("Enter Discount: ");
		int discount = scan.nextInt();
		double disamt = (fee*discount)/100;
		double finalamt = fee - disamt;
		System.out.println("The discount amount is INR "+discount+
		" and final discounted fee is INR "+finalamt);
	}
}