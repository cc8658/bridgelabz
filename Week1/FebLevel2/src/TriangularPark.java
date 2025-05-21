import java.util.Scanner;
class TriangularPark{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Side1: ");
        int side1 = scan.nextInt();
        System.out.print("Enter Side2: ");
        int side2 = scan.nextInt();
        System.out.print("Enter Side3: ");
        int side3 = scan.nextInt();
        int perimeter = side1+side2+side3;
        int rounds = 5000/perimeter;
        System.out.println("The total number of rounds the athlete will run is "+rounds+" to complete 5 km");
    }
}