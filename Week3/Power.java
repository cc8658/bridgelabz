import java.util.Scanner;
class Power{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Base=");
		int base=scan.nextInt();
		System.out.print("Exponent=");
		int exp=scan.nextInt();
		double result=Math.pow(base,exp);
		System.out.println("Result= "+result);
	}
}
		