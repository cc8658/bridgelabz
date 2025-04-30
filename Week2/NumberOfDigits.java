import java.util.Scanner;
class NumberOfDigits{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Integer: ");
		int num = scan.nextInt();
		int original = num;
		int count =0;
		while(original!=0){
			int digit = original%10;
			original=original/10;
			count++;
		}
		System.out.println("Number of Digits: "+count);
	}
}
