import java.util.Scanner;
class Employees{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double[] salary = new double[10];
		double[] years = new double[10];
		double[] newsalary = new double[10];
		double[] bonus = new double[10];
		double totalbonus=0,totaloldsalary=0,totalnewsalary=0;
		for(int i=0;i<10;i++){
			System.out.println("Enter the Salaries and Years: ");
			salary[i] = scan.nextDouble();
			years[i] = scan.nextDouble();
		}
		for(int i=0;i<10;i++){
			if(years[i]>5){
				bonus[i]=5*salary[i]/100;
				newsalary[i]=salary[i]+bonus[i];
			}
			else if(years[i]<5){
				bonus[i]=2*salary[i]/100;
				newsalary[i]=salary[i]+bonus[i];
			}
		}
		for (int i=0;i<10;i++){
			totalbonus=totalbonus+bonus[i];
			totaloldsalary=totaloldsalary+salary[i];
			totalnewsalary=totalnewsalary+newsalary[i];
		}
		System.out.println("Total Bonus PAyout: "+totalbonus);
		System.out.println("Total Old Salaries: "+totaloldsalary);
		System.out.println("Total New Salaries: "+totalnewsalary);
	}
}
				
		