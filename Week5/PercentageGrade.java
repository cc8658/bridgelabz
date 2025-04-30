import java.util.Scanner;
class PercentageGrade{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Numbers: ");
		int num = scan.nextInt();
		double[] maths = new double[num];
		double[] physics = new double[num];
		double[] chemistry = new double[num];
		double[] percentage = new double[num];
		String[] grade = new String[num];
		for(int i=0;i<num;i++){
			System.out.print("Enter the Student "+i+" Maths Marks: ");
			maths[i]=scan.nextDouble();
			if(maths[i]<=100){
		
			}
			else{
				System.out.print("Enter marks Between 0 to 100: ");
			maths[i]=scan.nextDouble();
			}
			System.out.print("Enter the Student "+i+" the Physics Marks: ");
			physics[i	]=scan.nextDouble();
			if(physics[i]<=100){
				
			}
			else{
				System.out.print("Enter marks Between 0 to 100: ");
			physics[i]=scan.nextDouble();
			}
			System.out.print("Enter the Student "+i+" the Chemistry marks: ");
			chemistry[i]=scan.nextDouble();
			if(chemistry[i]<=100){
			
			}
			else{
				System.out.print("Enter marks Between 0 to 100: ");
			chemistry[i]=scan.nextDouble();
			}
			percentage[i]=(maths[i]+physics[i]+chemistry[i])/3;
		}
		for(int i=0;i<num;i++){
			if(percentage[i]>=80){
				grade[i]="A";
			}
			else if(percentage[i]>=70 && percentage[i]<=79.9){
				grade[i]="B";
			}
			else if(percentage[i]>=60 && percentage[i]<=69.9){
				grade[i]="C";
			}
			else if(percentage[i]>=50 && percentage[i]<=59.9){
				grade[i]="D";
			}
			else if(percentage[i]>=40 && percentage[i]<=49.9){
				grade[i]="E";
			}
			else if(percentage[i]<=39.9){
				grade[i]="R";
			}
		}
		for(int i=0;i<num;i++){
			System.out.println("The Marks of Maths:"+maths[i]+
			", Physics:"+physics[i]+", Chemistry:"+chemistry[i]+
			", and Percentage is:"+percentage[i]+" and Grade is:"+grade[i]);
		}
	}
}
			