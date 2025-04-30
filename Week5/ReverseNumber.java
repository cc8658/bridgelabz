import java.util.Scanner;
class ReverseNumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = scan.nextInt();
		int[] digit=new int[10];
		int index=0;
		int temp=num;
		while(temp>0){
			int rem=temp%10;
			digit[index]=rem;
			temp=temp/10;
			index++;
		}
		System.out.print("digits in an Array: ");
		for(int i=0;i<index;i++){
			System.out.print(digit[i]);
		}
		System.out.print("\nReverse of an Array: ");
		for(int i=index-1;i>=0;i--){
			System.out.print(digit[i]);
		}
	}
}
		