import java.util.Scanner;
class Height{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Centimeters: ");
		double cm = scan.nextDouble();
		double inches = cm/2.54;
		double feet = inches/12;
		System.out.println("Your Height in cm is "+cm+
		" while in feet is "+feet+" and inches is "+inches);
	}
}