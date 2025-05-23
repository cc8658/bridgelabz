

public class CustomQueue {
    int[] data;
    public static final int DEFAULT_SIZE =10;
    int end=0;

    public CustomQueue(){
        this(DEFAULT_SIZE);

    }

    public CustomQueue(int size){
        this.data=new int[size];
    }

    public boolean isfull(){
        return end==data.length;
    }
    public boolean isempty(){
        return end ==0 ;
    }

    public boolean insert(int item){
        if(isfull()){
            return false;
        }
        data[end++]=item;
        return true;

    }
    public int remove() throws Exception{
        if(isempty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[0];
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }

    public int first() throws Exception{
        if(isempty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }
    public void display(){
        for(int i=0;i<end;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("");

    }


}
