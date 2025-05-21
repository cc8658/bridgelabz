import java.util.Scanner;
class CalculateBmi{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Weight in kgs: ");
		double weight = scan.nextDouble();
		System.out.print("Enter Height in cms: ");
		double height = scan.nextDouble();
		double meters = height/100;
		double bmi = weight/(meters*meters);
		if(bmi<=18.4){
			System.out.println("Underweight");
		}
		else if(18.4<bmi && bmi<=24.9){
			System.out.println("Normal");
		}
		else if (25<=bmi && bmi<=39.9){
			System.out.println("Overweight");
		}
		else{
			System.out.println("Obese");
		}
	}
}
