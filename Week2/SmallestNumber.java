import java.util.Scanner;
class SmallestNumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number1: ");
		int num1 = scan.nextInt();
		System.out.print("Enter Number2: ");
		int num2 = scan.nextInt();
		System.out.print("Enter Number3: ");
		int num3 = scan.nextInt();
		System.out.print("Is the first number the samllest? "
		+((num1<num2)&&(num1<num3)));
	}
}