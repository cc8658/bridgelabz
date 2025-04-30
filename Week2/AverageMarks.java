import java.util.Scanner;
class AverageMarks{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Maths Marks: ");
		int maths = scan.nextInt();
		System.out.print("Enter Physics Marks: ");
		int physics = scan.nextInt();
		System.out.print("Enter Chemistry Marks: ");
		int chemistry = scan.nextInt();
		double average = (maths+physics+chemistry)/3;
		if (average >=80){
			System.out.println("AverageMarks: "+average+" , Grade: A and Remarks: Level 4, above agency-normalized standards");
		}
		else if(80>average && average>=70){
			System.out.println("AverageMarks: "+average+" , Grade: B and Remarks: Level 3, at agency-normalized standards");
		}
		else if(70>average && average>=60){
			System.out.println("AverageMarks: "+average+" , Grade: C and Remarks: Level 2, below, but approaching agency-normalized standards");
		}
		else if (60>average && average>=50){
			System.out.println("AverageMarks: "+average+" , Grade: D and Remarks: Level 1, well below agency-normalized standards");
		}
		else if(50>average && average>=40){
			System.out.println("AverageMarks: "+average+" , Grade: E and Remarks: Level 1, to below agency-normalized standards");
		}
		else{
			System.out.println("AverageMarks: "+average+" , Grade: R and Remarks: Remedial standards ");
		}
	}
}

			
		
		