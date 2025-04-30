//write a program to find 
import java.util.Scanner;
class TwoSum{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int i=1;
		int sum=0;
		while(i<=number){
			sum = sum+i;
			i++;
		}
		System.out.println(sum);
	}
}
