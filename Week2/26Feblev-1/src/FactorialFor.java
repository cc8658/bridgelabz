import java.util.Scanner;
class FactorialFor{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Factorial Number: ");
		int n = scan.nextInt();
		int total=1;
		if (n==0){
			System.out.print("1");
			
		}
		else{
			for ( int a=n;a>0;a--){
				total = total*a;
			}
			System.out.println("The output of factorial: "+ total);
		}
	}
}