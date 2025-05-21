import java.util.Scanner;
class CompareSum{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter N Natural numbers: ");
		int n = scan.nextInt();
		int total=0;
		int i=1;
		if (n<=0){
			System.out.println("Please enter a valid natural number");
		}
		else{
			while(i<=n){
				total=total+i;
				i ++;
			}
		}
			System.out.println("Output using while loop"+total);
		int formula = n*(n+1)/2;
		System.out.println("Output using formula: "+formula);
		if (total == formula){
			System.out.println("Both results are same");
		}
		else{
			System.out.println("Please check the logic");
		}
	}
}	