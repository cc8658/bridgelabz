public class CircularQueue {
    int[] data;
    public static final int DEFAULT_VALUE=10;
    int end=0;
    int front=0;
    int size=0;
    public CircularQueue(){
        this(DEFAULT_VALUE);
    }
    public CircularQueue(int size){
        this.data=new int[size];
    }
    public boolean isfull(){
        return size==data.length;

    }
    public boolean isempty(){
        return size==0;
    }
    public boolean insert(int item){
        if(isfull()){
            return false;
        }
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isempty()){
            throw new Exception("Queue empty");
        }
        int reomved=data[front++];
        front=front%data.length;
        size--;
        return reomved;
    }
    public int front() throws Exception{
        if(isempty()){
            throw new Exception("Queue empty");

        }
        return data[0];
    }
}
