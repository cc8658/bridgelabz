import java.util.Scanner;
class Convertion{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Kilometers: ");
		double a=scan.nextDouble();
		double convert=a*0.621371;
		System.out.println("Miles= "+convert);
	}
}