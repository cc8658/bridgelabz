import java.util.Scanner;
public class addition{
	public static void main(String[] args){
		
		Scanner myObj= new Scanner(System.in);
		System.out.print("A= ");
		int a=myObj.nextInt();
		System.out.print("B= ");
		int b=myObj.nextInt();
		double c=a+b;
		System.out.println("Addition: "+c);
	}
}