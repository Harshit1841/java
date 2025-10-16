package seniorQuestion;

public class subString {
    public static void main(String[] args){
        String s = "abcde";
        System.out.println(s.substring(1));//bcde
        System.out.println(s.substring(1,4));//bcd
        System.out.println(s.substring(2,2));// empty
        System.out.println(s.substring(0,5));//abcde
    }
}
