import java.util.Scanner;
class CompareTwoStrings{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the First String:");
		String one = scan.nextLine();
		System.out.print("Enter the Second String:");
		String two = scan.nextLine();
		System.out.println("Using Equal() Function: "+one.equals(two));
		System.out.println("Using CHARAT() Function: "+result(one,two));
	}
		
	 static boolean result(String one,String two){
			if(one.length() == two.length()){
			for(int i=0;i<one.length();i++){
				if(one.charAt(i)==two.charAt(i)){
					return true;
				}
			}
			}
			else{
				return false;
			}
		return false;
		}
					
	
}