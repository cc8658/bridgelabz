import java.util.Scanner;
import java.util.Arrays;
class ReturnAllChar{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String name = scan.nextLine();
        char[] builtin = name.toCharArray();
        char[]  user = letter(name);
        System.out.println("User Defined Method:"+Arrays.toString(user));
        System.out.println("In-Built Defined Method: "+Arrays.toString(builtin));
        System.out.println("Both are same: "+ Arrays.equals(user,builtin));

    }


    static char[] letter(String name){
        char[] let = new char[name.length()];
        for(int i=0;i<name.length();i++){
            let[i]=name.charAt(i);
        }
        return let;

    }
}
