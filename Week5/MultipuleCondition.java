import java.util.Scanner;
class MultipuleCondition{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] result = new int[10];
		System.out.print("Enter the Multiplication Number: ");
		int num=scan.nextInt();
		if(num<=9 && num>=6){
			for(int i=0;i<10;i++){
				result[i]=num*(i+1);
				System.out.println(num+" * "+(i+1)+" = "+result[i]);
			}
		}
		else{
			System.out.println("Enter the number from 6 to 9");
		}
	}
}