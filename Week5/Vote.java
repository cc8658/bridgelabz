import java.util.Scanner;
class Vote{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no.of Students: ");
		int s = scan.nextInt();
		int[] ages = new int[s];
		for(int i=0;i<s;i++){
			ages[i] = scan.nextInt();
		}
		for(int i=0;i<s;i++){
			if(ages[i]<0){
				System.out.println("Invalid Age");
			}
			else if(ages[i]>=0 && ages[i]<18){
				System.out.println("The Student with the age "+ages[i]+" Cannot Vote");
			}
			else{
				System.out.println("The Student with the age "+ages[i]+" Can Vote");
			}
		}
	}
}
			