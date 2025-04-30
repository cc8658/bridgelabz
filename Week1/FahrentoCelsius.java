import java.util.Scanner;
class FahrentoCelsius{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Fahrenhit value: ");
		double fahrenheit = scan.nextDouble();
		double celsius = (fahrenheit-32)*5/9;
		System.out.println("The "+fahrenheit+" fahrenheit is "+celsius+" celsius");
	}
}