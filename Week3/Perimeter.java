import java.util.Scanner;
class Perimeter{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Length: ");
		int len=scan.nextInt();
		System.out.print("Width: ");
		int wid=scan.nextInt();
		double perimeter=2*(len+wid);
		System.out.println("Perimeter= "+perimeter);
	}
}