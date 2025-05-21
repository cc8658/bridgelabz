import java.util.Scanner;
class Convertioninput{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double km = scan.nextDouble();
        double mile = km / 1.6;
        System.out.print("The total miles is "+mile+
                " mile for the given "+km+" km");
    }
}