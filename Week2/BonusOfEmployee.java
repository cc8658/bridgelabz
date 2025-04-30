import java.util.Scanner;
class BonusOfEmployee{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Income: ");
		int salary = scan.nextInt();
		System.out.print("Enter Years Of Service: ");
		int year = scan.nextInt();
		if (year>5){
			double bonus = salary*5/100;
			double amount = salary+bonus;
			System.out.println("The Bonus Amount: "+amount);
		}
		else{
			System.out.print("No Bonus and Your Amount is: "+salary);
		}
	}
}
		