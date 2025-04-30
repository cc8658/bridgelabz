import java.util.Scanner;
class NumberOfChocolates{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter No.Of Chocolates: ");
		int choco = scan.nextInt();
		System.out.print("Enter No.Of Childerns: ");
		int child = scan.nextInt();
		int eachchild = choco/child;
		int remaining = choco % child;
		System.out.println("The number of chocolates each child gets is "+
		eachchild+" and the number of remaining chocolates are "+remaining);
	}
}