import java.util.Scanner;
class CheckNumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = scan.nextInt();
		if (num>0){
			System.out.println("Given number is Positive");
		}
		else if(num<0){
			System.out.println("Given number is Negative");
		}
		else{
			System.out.println("Given numberis Zero");
		}
	}
}