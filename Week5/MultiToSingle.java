import java.util.Scanner;
class MultiToSingle{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no.of Rows: ");
		int row = scan.nextInt();
		System.out.print("Enter no.of Columns: ");
		int column = scan.nextInt();
		int index=0;
		int m=row*column;
		int[][] two = new int[row][column];
		int[] one = new int[m];
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				two[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print(two[i][j]+" ");
			}
			System.out.print("\n");
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				one[index]=two[i][j];
				index++;
			}
		}
		for(int i:one){
			System.out.print(i+" ");
		}
	}
}
		