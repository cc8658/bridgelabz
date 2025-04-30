import java.util.Scanner;
class Calculation{
	Scanner scan = new Scanner(System.in);
	
	int a=scan.nextInt();
	
	int b=scan.nextInt();
}
class Addition extends Calculation{
	public void Add(){
		double addition = a+b;
	System.out.println("The Addition is: "+addition);
	}
}
class Subtraction extends Calculation{
	public void Sub(){
		double subtraction = a-b;
		System.out.println("The Subtraction is: "+subtraction);
	}
}
class Mutilpication extends Calculation{
	public void Multi(){
		double multiplication = a*b;
		System.out.println("The Multiplication is: "+multiplication);
	}
}
class Division extends Calculation{
	public void Div(){
		double division = a/b;
		System.out.println("The Division is: "+division);
	}
}
class Inheritance{
	public static void main(String[] args){
		Addition c = new Addition();
		c.Add();
		Subtraction d = new Subtraction();
		d.Sub();
		Mutilpication e = new Mutilpication();
		e.Multi();
		Division f = new Division();
		f.Div();
	}
}