import java.util.Scanner;

public class SubstringComparison{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String:");
        String name =scan.next();
		System.out.print("Enter the Start:");
		int start = scan.nextInt();
		System.out.print("Enter the End:");
		int end  = scan.nextInt();
	
		String sub=name.substring(start,end);
		String two="";
		for (int i=start;i<end;i++){
			two=two+name.charAt(i);
		}
		System.out.println(sub);
		System.out.println(two);
		System.out.println(sub.equals(two));
	}
}
