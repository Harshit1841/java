package Javaoops;

class Animals {
    public void eat(){
        System.out.println("i am eating");
    }
    public static void main(String[] args){
        System.out.println("1");
        Animals buzo = new Animals();
        buzo.eat();
        buzo.run();
        Birds sp = new Birds();
        sp.fly();

    }
    public void run(){
        System.out.println("i am running");
    }
}
class Birds{
    void fly(){
        System.out.println("i am flying");
    }
}
