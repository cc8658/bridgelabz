import java.util.Scanner;
class Division{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        int number1 = scan.nextInt();
        System.out.print("Enter Number2: ");
        int number2 = scan.nextInt();
        double quot = number1 / number2;
        double rem = number1 % number2;
        System.out.println("The Quotient is "+quot+" and Reminder is "
                +rem+" of two number "+number1+" and "+ number2);
    }
}