import java.util.Scanner;
class Factors{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int num = scan.nextInt();
		int max =100;
		int index=0;
		int[] factor=new int[max];
		for (int i=1;i<=num;i++){
			if(num%i==0){
				factor[index++]=i;
			}
		}
		for(int i=0;i<index;i++){
			System.out.println(factor[i]);
		}
	}
}