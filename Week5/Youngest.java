import java.util.Scanner;
class Youngest{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double[] age = new double[3];
		double[] height = new double[3];
		
		for(int i=0;i<3;i++){
			System.out.print("Enter the Age and Height: ");
			age[i]=scan.nextDouble();
			height[i]=scan.nextDouble();
		}
		double min=age[0];
		double maxheight=height[0];
		for(int i=0;i<3;i++){
			if(age[i]<min){
				min=age[i];
			}
			if(height[i]>maxheight){
				maxheight=height[i];
			}
		}
		System.out.println("The Youngest Age is: "+min);
		System.out.println("The Tallest Height is: "+maxheight);
	}
}	