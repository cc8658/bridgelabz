import java.util.Scanner;
class SalaryBonus{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        int salary = scan.nextInt();
        System.out.print("Enter Bonus: ");
        int bonus = scan.nextInt();
        double total = salary + bonus;
        System.out.println("The salary is INR "+salary+" and bonus is INR "
                +bonus+". Hence Total Income is INR "+total);
    }
}