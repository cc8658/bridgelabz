public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue que=new CustomQueue(6);
        que.insert(32);
        que.insert(22);
        que.insert(3);
        que.insert(2);
        que.insert(45);

        que.display();
        System.out.println(que.remove());
        que.display();
    }
}

