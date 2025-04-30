import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
//        Stack<Integer> num=new Stack<>();
//
//        num.push(12);
//        num.push(98);
//        num.push(13);
//        num.push(23);
//        num.push(1);
//        System.out.println(num.pop());
//        System.out.println(num.pop());
//        System.out.println(num.pop());
//        System.out.println(num.pop());

        Queue<Integer> num=new LinkedList<>();
        num.add(21);
        num.add(23);
        num.add(43);
        num.add(32);

        System.out.println(num.remove());
        System.out.println(num.remove());
        System.out.println(num.remove());
        System.out.println(num.remove());

    }
}