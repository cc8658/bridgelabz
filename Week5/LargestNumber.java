import java.util.Scanner;
class LargestNumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = scan.nextInt();
		int[] digit=new int[10];
		int index=0;
		int dig=num;
		int rem=0;
		int secondmax=0;
		while(dig>0){
			rem=dig%10;
			digit[index]=rem;
			dig = dig/10;
			index++;
		}
		int max=digit[0];
		for (int i=0;i<index;i++){
			if(digit[i]>max){
				secondmax=max;
				max=digit[i];
			}
		}
		System.out.println("The largest Number is: "+max);
		System.out.println("The Second Largest Number: "+secondmax);
	}
}