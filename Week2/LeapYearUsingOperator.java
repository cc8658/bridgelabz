import java.util.Scanner;
class LeapYearUsingOperator{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Year: ");
		int year = scan.nextInt();
		if((year%4 ==0 && year%100 != 0) || year%400==0){
			System.out.println("It is a Leap Year");
		}
		else{
			System.out.println("It is not a Leap Year");
		}
	}
}