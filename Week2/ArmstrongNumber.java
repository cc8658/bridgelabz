import java.util.Scanner;
class ArmstrongNumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num= scan.nextInt();
		int originalnum= num;
		double sum = 0;
		while(originalnum!=0){
			int digit = originalnum%10;
			sum = sum+Math.pow(digit,3);
			originalnum = originalnum/10;
		}
		if(num == sum){
			System.out.println("It is a Armstrong Number");
		}
		else{
			System.out.println("It is not a Armstrong Number");
		}
	}
}