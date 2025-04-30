import java.util.Scanner;
class SwapNumbers{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number1: ");
		int num1 = scan.nextInt();
		System.out.print("Enter Number2: ");
		int num2 = scan.nextInt();
		int c=num1;
		num1 = num2;
		num2 = c;
		System.out.println("The swapped numbers are "+num1+" and "+num2);
	}
}