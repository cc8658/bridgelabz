import java.util.Scanner;
class FrequencyDigit{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num=scan.nextInt();
		int[] frequency=new int[10];
		int count=0;
		int index=0;
		int temp=num;
		
		while(temp>0){
			int rem=temp%10;
			frequency[rem]++;
			temp=temp/10;
		}
		System.out.println("Frequency of digits:");
        for (int i =0; i<10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " times.");
            }
        }	
	}
}