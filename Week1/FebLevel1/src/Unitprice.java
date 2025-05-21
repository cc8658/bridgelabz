import java.util.Scanner;
class Unitprice{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter UnitPrice: ");
        double price = scan.nextDouble();
        System.out.print("Enter Quantity: ");
        double quantity = scan.nextDouble();
        double total = price * quantity;
        System.out.println("The total purchase price is INR "
                +total+" if the quantity "+quantity+" and unit price is INR "
                +price);
    }
}