import java.util.Scanner;
class CalculateSI{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Principal Amount: ");
        double principal = scan.nextDouble();
        System.out.print("Rate of Interest: ");
        double interest = scan.nextDouble();
        System.out.print("Time in Years: ");
        double time = scan.nextDouble();
        double si = principal * interest * time / 100;
        System.out.println("The Simple Interest is "+si+" for Principal "
                +principal+", Rate of Interest "+interest+", and Time "+time);
    }
}