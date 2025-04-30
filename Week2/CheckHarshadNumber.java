import java.util.Scanner;
class CheckHarshadNumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = scan.nextInt();
		int sum = 0;
		int original = num;
		while(original!=0){
			int rem =original%10;
			sum = sum+rem;
			original =original/10;
		}
		if (num%sum==0){
			System.out.println("Harshad Number");
		}
		else{
			System.out.println("Not a Harshad Number");
		}
	}
}
			