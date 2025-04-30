import java.util.Scanner;
class Simple{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Principal Amount: ");
		int principal=scan.nextInt();
		System.out.print("Rate of Interest: ");
		int rate=scan.nextInt();
		System.out.print("No.of years: ");
		int time=scan.nextInt();
		double si=(principal*rate*time/100);
		System.out.println("Simmple Interest="+ si);
	}
}