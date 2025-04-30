import java.util.Scanner;
class LargestNumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number1: ");
		int num1 = scan.nextInt();
		System.out.print("Enter Number2: ");
		int num2 = scan.nextInt();
		System.out.print("Enter Number3: ");
		int num3 = scan.nextInt();
		System.out.println("Is the first number the Largest? "
		+((num1>num2)&&(num1>num3)));
		System.out.println("Is the second number the Largest? "
		+((num2>num1)&&(num2>num3)));
		System.out.println("Is the third number the Largest? "
		+((num3>num1)&&(num3>num2)));
	}
}