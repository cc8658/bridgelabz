import java.util.Scanner;
class volume{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Radius: ");
		int radius=scan.nextInt();
		System.out.println("Height: ");
		int height=scan.nextInt();
		double volume=(22*radius*radius*height)/7;
		System.out.println("Volume="+ volume);
	}
}