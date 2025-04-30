import java.util.Scanner;
class Calculator{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		double first = scan.nextDouble();
		System.out.print("Enter Second Number: ");
		double second = scan.nextDouble();
		System.out.print("Enter Operator: ");
		char op = scan.next().charAt(0);
		double result;
		switch (op){
			case '+':
			result = first+second;
			System.out.println("The Result is: "+result);
			break;
			case '-':
			result = first-second;
			System.out.println("The Result is: "+result);
			break;
			case '*':
			result = first*second;
			System.out.println("The Result is: "+result);
			break;
			case '/':
			result = first/second;
			System.out.println("The Result is: "+result);
			break;
			default:
			System.out.println("Invalid Operator");
			break;
		}
	}
}

		