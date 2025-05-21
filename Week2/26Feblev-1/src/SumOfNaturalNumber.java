import java.util.Scanner;
class SumOfNaturalNumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter N Natural Numbers: ");
		int n = scan.nextInt();
		if (n>0){
			int a = n*(n+1)/2;
			System.out.println("The sum of "+n+" natural numbers is "+a);
		}
		else{
			System.out.println("The number "+n+" is not a natural number");
		}
	}
}