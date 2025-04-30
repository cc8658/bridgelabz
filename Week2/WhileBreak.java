import java.util.Scanner;
class WhileSum{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double total=0;		
		while( true){
			System.out.print("Enter a Number: ");
			double num = scan.nextDouble();
			if (num<=0){
			    break;			    
			}
			total = total+num;			
		}
		System.out.println("Total Sum is: "+total);
	}
}
