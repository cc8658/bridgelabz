import java.util.Scanner;
class CheckDivision{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = scan.nextInt();
		System.out.print("Is the number "+num+
		" divisible by 5? "+(num%5==0));
	}
}