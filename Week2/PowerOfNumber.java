import java.util.Scanner;
class PowerOfNumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = scan.nextInt();
		System.out.print("Enter a Power: ");
		int power = scan.nextInt();
		int result = 1;
		for(int i=1;i<=power;i++){
			result=result*num;
		}
		System.out.println(num+" raised to the power of "+power+" is: "+result);
	}
}