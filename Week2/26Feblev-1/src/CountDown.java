import java.util.Scanner;
class CountDown{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Count down Number: ");
		int num = scan.nextInt();
		//int count = 1;
		//int sum = num+1;
		//while(count < sum){
		//	sum --;
		//	System.out.println(sum);
		//}
		for (int i=num;i>0;i--){
			System.out.println(i);
		}
	}
}