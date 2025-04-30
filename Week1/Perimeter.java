import java.util.Scanner;
class Perimeter{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a side: ");
		double side = scan.nextDouble();
		double perimeter = 4 * side;
		System.out.println("The lenght of the side is "+side+
		" whose perimeter is "+perimeter);
	}
}