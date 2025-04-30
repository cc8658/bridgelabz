public class StackMain {
    public static void main(String[] args) throws StackException {
        DynamicStack stack=new DynamicStack(5);
        stack.push(76);
        stack.push(23);
        stack.push(12);
        stack.push(67);
        stack.push(43);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
