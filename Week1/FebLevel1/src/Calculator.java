import java.util.Scanner;
class Calculator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num1: ");
        float a = scan.nextFloat();
        System.out.print("Enter num2: ");
        float b = scan.nextFloat();
        float add = a + b;
        float sub = a - b;
        float mul = a * b;
        float div = a / b;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                +a+" and "+b+" is "+add+","+sub+","+mul+", and "+div);
    }
}
