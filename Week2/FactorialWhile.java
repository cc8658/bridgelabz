import java.util.Scanner;
class FactorialWhile{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Factorial Number: ");
		int n = scan.nextInt();
		int a = 1;
		if (n==0){
			System.out.print("1");
			
		}
		else{
			while(n>0){
				a = n*a;
				n--;
			}
			System.out.println("The output of factorial: "+ a);
		}
	}
}