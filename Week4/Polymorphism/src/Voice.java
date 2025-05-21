abstract class animal{
    abstract void sound();
    void sleep(){
        System.out.println("It is sleeping..");
    }
}
class name extends animal{
    void sound(){
        System.out.println("It will sound like it's voice");
    }
}
class Voice{
    public static void main(String[] args){
        animal b = new animal() {
            @Override
            void sound() {

            }
        };
        b.sleep();
        b.sound();
    }
}
