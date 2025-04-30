import java.util.Scanner;
class RightToVote{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Age: ");
		int age = scan.nextInt();
		if (age >=18){
			System.out.print("The person's age is "+age+" and can vote");
		}
		else{
			System.out.println("The person's age is "+age+ " and cannot vote");
		}
	}
}