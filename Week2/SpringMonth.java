import java.util.Scanner;
class SpringMonth{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Month Number: ");
		int month = scan.nextInt();
		System.out.print("Enter Day Number: ");
		int day = scan.nextInt();
		if ((month>2) && (month<7)){
			if ((day>19) && (day<32)){
				System.out.println("its a Spring Season");
			}
		}
		else if ((month<1)&&(month>12)){
			if ((day<1)&&(day>31)){
				System.out.println("Please enter correct Month and Day");
			}
		}
		else{
			System.out.println("Not a Spring Season");
		}
	}
}