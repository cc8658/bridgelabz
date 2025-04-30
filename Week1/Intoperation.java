import java.util.Scanner;
class Intoperation{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value of A: ");
		int a = scan.nextInt();
		System.out.print("Enter value of B: ");
		int b = scan.nextInt();
		System.out.print("Enter value of C: ");
		int c = scan.nextInt();
		double one = a + b * c;
		double two = a * b + c;
		double three = c + a / b;
		double four = a % b + c;
		System.out.println("The results of Int Operations are "+one+","
		+two+","+three+","+four);
	}
}