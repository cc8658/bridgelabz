import java.util.Scanner;
class FootBallTeam{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double[] height = new double[11];
		System.out.println("Enter the Height of 11 Players: ");
		double length = height.length;
		double sum = 0;
		for(int i=0;i<11;i++){
			height[i] = scan.nextDouble();
			sum = sum+height[i];
		}
		double mean = sum/length;
		System.out.println("The Mean Height of FootBall Team is: "+mean);
	}
}
			
			
			
			