package Module15strings;

public class lowerUpperCase {
    public static void main(String[] args) {
        String s = "Raghav Garg IS 24 Years Old";
        //toLowerCase: to print all small letter
//        System.out.println(s.toLowerCase());
//        s.toLowerCase(); -> nothing will happen
        s = s.toLowerCase();
        System.out.println(s);
        //toUpperCase -> all letter is capital
        System.out.println(s.toUpperCase());

        //toConcat
        String a = "abc";
        String b = "xyz";
        //a.concat(b): -> nothing
        System.out.println(a.concat(b));
        System.out.println(a);
        a = a.concat(b);
        System.out.println(a);
        //empty string
        String x = "";
        System.out.println(x);
    }
}
