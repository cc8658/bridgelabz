import java.util.Scanner;
class WhileSums{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		double num = scan.nextDouble();
		double total=0;
		while( num>0){
			total = total+num;
			System.out.print("Enter a Number: ");
			num = scan.nextDouble();
		}
		System.out.println("Total Sum is: "+total);
	}
}