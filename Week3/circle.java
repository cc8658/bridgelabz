import java.util.Scanner; 
class circle{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter Radius= ");
		int radius=scan.nextInt();
		float area=(22*radius*radius)/7;
		System.out.println("Area= "+ area);
	}
}
		