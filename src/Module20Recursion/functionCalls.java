package Module20Recursion;

public class functionCalls {
    public static void mango(){
        System.out.println("Hi, I am in main mango");

    }
    public static void banana(){
        mango();
        System.out.println("Hi, I am in main banana");

    }
    public static void apple(){
        banana();
        System.out.println("Hi, I am in apple");
        mango();
    }
    public static void main(String[] args){
        System.out.println("Hi, I am in main method");
        apple();
    }
}
