import java.util.Scanner;
class EvenOrOdd{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int number = scan.nextInt();
		if(number<=0){
			System.out.println("Enter a Natural Number");
		}
		int[] even = new int[number/2+1];
		int[] odd = new int[number/2+1];
		int evenindex=0;
		int oddindex=0;
		for(int i=1;i<=number;i++){
			if(i%2==0){
				even[evenindex++]=i;
			}
			else{
				odd[oddindex++]=i;
			}
		}
		System.out.print("The Even Numbers are: ");
		for (int i=0;i<evenindex;i++){
			System.out.print(even[i]+" ");
		}
		System.out.print("\nThe Odd Numbers are: ");
		for (int i=0;i<oddindex;i++){
			System.out.print(odd[i]+" ");
		}
			
	}
}