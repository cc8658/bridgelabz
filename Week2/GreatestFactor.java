import java.util.Scanner;
class GreatestFactor{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int number = scan.nextInt();
		int factor =1;
		for (int i=number-1;i>0;i--){
			if(number%i==0){
				factor = i;
				break;
			}
		}
		System.out.println("The GreatestFactor of "+number+" is "+factor);
	}
}
			