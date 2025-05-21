import java.util.Scanner;
class MultipleOfNumbers{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = scan.nextInt();
		if (n>=6 && n<=9){
			for(int i=1;i<=10;i++){
				int b = n*i;
				System.out.println("Value of "+n+" * "+i+" = "+b);
			}
		}
		else{
			System.out.println("Enter the Number from 6 to 9");
		}
	}
}