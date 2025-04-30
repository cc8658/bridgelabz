import java.util.Scanner;
class CheckAbundantNumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = scan.nextInt();
		int sum = 0;
		for(int i=1;i<num;i++){
			if(num%i==0){
				sum+=i;
			}
		}
		if(sum>num){
			System.out.println("Abundant Number");
		}
		else{
			System.out.println("Not an Abundant Number");
		}
	}
}