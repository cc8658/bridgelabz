import java.util.Scanner;
class BodyMassIndex{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number of persons: ");
		int mem=scan.nextInt();
		double[] weight = new double[mem];
		double[] height = new double[mem];
		double[] bmi = new double[mem];
		String[] status = new String[mem];
		for(int i=0;i<mem;i++){
			System.out.print("Enter the Weight and Height: ");
			weight[i]=scan.nextDouble();
			height[i]=scan.nextDouble();
			bmi[i]=weight[i]/(height[i]*height[i]);
			if(bmi[i]<=18.4){
				status[i]="UnderWeight";
			}
			else if(bmi[i]>=18.5 && bmi[i]<=24.9){
				status[i]="Normal";
			}
			else if(bmi[i]>=25 && bmi[i]<=39.9){
				status[i]="OverWeight";
			}
			else if(bmi[i]>=40){
				status[i]="Obese";
			}
		}
		for(int i=0;i<mem;i++){
			System.out.println("The Height is "+height[i]+
			", Weight is "+weight[i]+", and BMI is "+bmi[i]+
			", Status of person is "+status[i]);
		}
	}
}
		