import java.util.Scanner;
class Multiplication{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Multiplication table Number: ");
		int num = scan.nextInt();
		int[] result = new int[10];
		for (int i=0;i<10;i++){
			result[i]=num*(i+1);
			System.out.println(num+" * "+(i+1)+" = "+result[i]);
		}
	}
}