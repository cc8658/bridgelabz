import java.util.Scanner;
class YoungestAmongAll{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Age Amar: ");
		int amar = scan.nextInt();
		System.out.print("Enter the Age Akbar: ");
		int akbar = scan.nextInt();
		System.out.print("Enter the Age Anthony: ");
		int anthony = scan.nextInt();
		System.out.print("Enter the Height of Amar: ");
		int amarheig = scan.nextInt();
		System.out.print("Enter the Height of Akbar: ");
		int akbarheig = scan.nextInt();
		System.out.print("Enter the Height of Anthony: ");
		int anthonyheig = scan.nextInt();
		if(amar<akbar && amar<anthony){
			System.out.println("Youngest Among is: Amar");
		}
		else if(akbar<amar && akbar<anthony){
			System.out.println("Youngest Among is: Akbar");
		}
		else{
			System.out.println("Youngest Among is: Anthony");
		}
		if(amarheig>akbarheig &&amarheig>anthonyheig){
			System.out.println("Tallest Friend: Amar");
		}
		else if(akbarheig>amarheig && akbarheig>anthonyheig){
			System.out.println("Tallest Friend: Akbar");
		}
		else{
			System.out.println("Tallest Friend: Anthony");
		}
	}
}

		