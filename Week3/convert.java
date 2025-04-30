import java.util.Scanner;
class convert{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Celsius Value= ");
		int celsius=scan.nextInt();
		double fahrenheit=(celsius*9/5)+32;
		System.out.println("Fahrenheit: "+ fahrenheit);
	}
}