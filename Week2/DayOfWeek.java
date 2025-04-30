import java.util.Scanner;
class DayOfWeek{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Month: ");
		int m = scan.nextInt();
		System.out.print("Enter the Day: ");
		int d = scan.nextInt();
		System.out.print("Enter the year: ");
		int y = scan.nextInt();
		if(0<m && m<13){
			
		}
		else{
			System.out.println("Enter Correct Month");
		}
		if(0<d && d<32){
			
		}
		else{
			System.out.println("Enter Correct Day");
		}
		
		int yo = y-(14-m)/12;
		int x = yo +(yo/4)-(yo/100)+(yo/400);
		int mo = m+12*((14-m)/12)-2;
		int d0 =(d+x+(31*mo/12)) % 7;
		switch (d0){
			case 1:
			System.out.println("Monday");
			break;
			case 2:
			System.out.println("Tuesday");
			break;
			case 3:
			System.out.println("Wednesday");
			break;
			case 4:
			System.out.println("Thursday");
			break;
			case 5:
			System.out.println("Friday");
			break;
			case 6:
			System.out.println("Saturday");
			break;
			case 0:
			System.out.println("Sunday");
			break;
			default:
			System.out.println("Invalid Number");
			break;
		}
	}
}