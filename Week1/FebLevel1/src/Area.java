import java.util.Scanner;
class Area{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Base: ");
        double base = scan.nextDouble();
        System.out.print("Enter Height: ");
        double height = scan.nextDouble();
        double tri = (base * height)/2;
        double inches = tri/(2.54*2.54);
        System.out.print("Your Height in cm is "+height+" while in feet is "
                +base+" and Area is "+tri);
    }
}