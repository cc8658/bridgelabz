import java.util.Scanner;
class TravelComputation{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Name: ");
		String name = scan.nextLine();
		System.out.print("Enter FromCity: ");
		String formcity = scan.nextLine();
		System.out.print("Enter ViaCity: ");
		String viacity = scan.nextLine();
		System.out.print("Enter ToCity: ");
		String tocity = scan.nextLine();
		System.out.print("Enter Distance From to Via: ");
		double fromtovia = scan.nextDouble();
		System.out.print("Enter Distance Via to Final: ");
		double viatofinal = scan.nextDouble();
		System.out.print("Enter Time From to Via in hours: ");
		double time1 = scan.nextDouble();
		System.out.print("Enter Time Via to Final in hours: ");
		double time2 = scan.nextDouble();
		double totaldis = fromtovia + viatofinal;
		double totaltime = time1 * 60 + time2 * 60;
		System.out.println("The Total Distance travelled by "+name+" from "
		+formcity+" to "+tocity+" via "+viacity+" is "+totaldis+" km and "
		+"the Total Time taken is "+totaltime+" minutes");
	}
}
		