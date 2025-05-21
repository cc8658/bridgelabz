import java.util.Scanner;
class Handshakes{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Total no.of Students: ");
        int s = scan.nextInt();
        double combination = (s*(s-1))/2;
        System.out.println("Number Of Possible Handshakes: "+combination);
    }
}