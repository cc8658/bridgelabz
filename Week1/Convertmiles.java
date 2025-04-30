import java.util.Scanner;

public class Convertmiles {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();
        
        final double FEET_IN_YARD = 3.0;  // 1 yard = 3 feet
        final double YARDS_IN_MILE = 1760.0;  // 1 mile = 1760 yards
        
        double distanceInYards = distanceInFeet / FEET_IN_YARD;        
        double distanceInMiles = distanceInYards / YARDS_IN_MILE;
        System.out.println("Distance in yards: " + distanceInYards + " yards");
        System.out.println("Distance in miles: " + distanceInMiles + " miles");
        
    }
}