import java.util.Scanner;
class PrintOddAndEven{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Natural Number: ");
		int n = scan.nextInt();
		if(n<=0){
			System.out.println("Give a Natural Number");
		}
		else{
			System.out.print("Even numbers are: ");
			for (int i=1;i<=n;i++){
				
				if(i%2==0){
					System.out.print(i+" ");
				}
			}
			System.out.print("\nOdd numbers are: ");
			for (int j=1;j<=n;j++){
				if(j%2!=0){
					System.out.print(j+" ");
				}
			}
		}
	}
}
		