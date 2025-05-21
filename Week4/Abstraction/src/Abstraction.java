interface cars{
    public void start();
    public void stop();
}
class car implements cars{
    public void start(){
        System.out.println("Car will be start");
    }
    public void stop(){
        System.out.println("car will be stop");
    }
}
class Abstraction{
    public static void main(String[] args){
        cars on = new car();
        on.start();
        on.stop();
    }
}