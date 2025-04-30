import java.util.Scanner;
class FizzBuzz{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = scan.nextInt();
		String [] result = new String[num+1];
		int index=0;
		for(int i=0;i<=num;i++){
			if(i%3==0 && i%5==0){
				result[i]="FizzBuzz";
			}
			else if(i%3==0){
				result[i]="Fizz";
			}
			else if(i%5==0){
				result[i]="Buzz";
			}
			else{
				result[i]=String.valueOf(i);
			}
		}
		for (int i=0;i<num;i++){
			System.out.println("Position "+i+" = "+result[i]);
		}
	}
}			