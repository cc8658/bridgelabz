import java.util.Scanner;
class PrintFizzBuzz{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Natural Number: ");
		int num  =  scan.nextInt();
		if(num<=0){
			System.out.println("Enter a Natural number");
		}
		else{
			for (int i=1;i<=num;i++){
				if(i%3==0){
					System.out.println("Fizz");
				}
				else if(i%5==0){
					System.out.println("Buzz");
				}
				else if(i%15==0){
					System.out.println("FizzBuzz");
				}
				else{
					System.out.println(i);
				}
			}
		}
	}
}