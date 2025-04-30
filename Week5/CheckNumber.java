import java.util.Scanner;
class CheckNumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the 5 Numbers: ");
		int[] num = new int[5];
		for (int i=0;i<5;i++){
			num[i]=scan.nextInt();
		}
		for(int i=0;i<5;i++){
			if(num[i]>0){
				if(num[i]%2==0){
					System.out.println(num[i]+" It is a Positive and Even number");
				}
				else{
					System.out.println(num[i]+" It is a Positive and Odd number");
				}
			}
			else if(num[i]==0){
				System.out.println(num[i]+" It is a Zero");
			}
			else{
				System.out.println(num[i]+" It is a Negative number");
			}
		}
	}
}