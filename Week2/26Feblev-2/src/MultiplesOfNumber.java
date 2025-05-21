import java.util.Scanner;
class MultiplesOfNumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = scan.nextInt();
		for(int i =100;i>=1;i--){
			if(i%num==0){
				System.out.println(i);
			}
		}
	}
}