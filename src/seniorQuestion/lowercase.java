package seniorQuestion;

public class lowercase {
    public static void main(String[] args){
        String s = "Raghav Garg IS 24 Years Old ";
        //System.out.println(s.toLowerCase());
        //s.toLowerCase(); -> nothing will happen
        s = s.toLowerCase();
        System.out.println(s);
        System.out.println(s.toUpperCase());

        String a = "abc";
        String b = "xyz";
        System.out.println(a.concat(b));
        System.out.println(a);
        a = a.concat(b);
        System.out.print(a);
    }
}
