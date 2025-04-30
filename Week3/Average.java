import java.util.Scanner;
class Average{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter value of A: ");
		int a=scan.nextInt();
		System.out.print("Enter value of B: ");
		int b=scan.nextInt();
		System.out.print("Enter value of c: ");
		int c=scan.nextInt();
		double aveg=(a+b+c)/3;
		System.out.println("Average= "+aveg);
	}
}