import java.util.Scanner;
class SampleProgram1{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = input.nextInt();
      if (number < 0) {
            System.err.println("Invalid Number.");
            System.exit(0);
      }
      int count = 0;
      int temp = number;
      while (temp > 0) {
            count++;
            temp /= 10;
      }
	  System.out.print("Array list: ");
      int[] digits = new int[count];
      for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
			System.out.print(digits[i]+" ");
      }
      int sum = 0;
      for (int i = 0; i < count; i++) {
            sum += digits[i];
      }
      System.out.println("\nSum of Digits: " + sum);

   }

}