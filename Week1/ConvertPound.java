import java.util.Scanner;
class ConvertPound{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter weight in pound: ");
		double pound = scan.nextDouble();
		double kg = pound * 2.2;
		System.out.print("The weight of the person in pound is "+pound+" and in kg is "+kg);
	}
}