import java.util.Scanner;
class Circle{
	double radius;
	
	Circle(){
		radius=3;
		System.out.println("Defualt data is:"+radius);
	}
	Circle(double radius){
		this.radius=radius;
		System.out.println("User given data is:"+radius);
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = scan.nextDouble();
		Circle a=new Circle();
		Circle b=new Circle(radius);
	}
}
	
	
