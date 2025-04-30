import java.util.Scanner;
class SumOfNumbers{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double[] value = new double[10];
		int i=0;
		double sum=0;
		while(i<10){
			double a=scan.nextDouble();
			if(a<=0)
			break;
		    value[i]=a;
			sum=sum+value[i];i++;
		}
		for(double o:value){
			if(o!=0)
			System.out.println(o);
		}
		System.out.println("sum= "+sum);
	}
}
	

			