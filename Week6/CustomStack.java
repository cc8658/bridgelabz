public class CustomStack {
    int[] data;
    public static final int DEFAULT_SIZE =5;
    int ptr=-1;
    public CustomStack(){
        this(DEFAULT_SIZE);

    }
    public CustomStack(int size){
        this.data=new int[size];
    }

    public boolean push(int item){
        if (isfull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws StackException{
        if(isempty()){
            throw new StackException("cannot pop from an empty stack!");
        }
        return data[ptr--];
    }
    public int peek() throws StackException {
        if(isempty()){
            throw new StackException("cannot peek from an empty stack.");
        }
        return data[ptr];
    }


    public boolean isfull(){
        return ptr==data.length-1;
    }
    public boolean isempty(){
        return ptr==-1;
    }
}
