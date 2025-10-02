package Module15strings;

public class indexOf {
    public static void main(String[] args) {
        //indexOf
        String s = "Raghav Mishra";
        System.out.println(s.indexOf('v'));
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('z'));
        //lastIndexOf : last se letter ke position.
        System.out.println(s.lastIndexOf('a'));

//       compareTo
        String a = "abc";
        String b = "dbc";
        System.out.println(a.compareTo(b));
        // contains()
        String c = "Physics Wallah Skills";
        System.out.println(c.contains("alla"));
        System.out.println(c.contains("slla"));
        //startsWith()
        System.out.println(c.startsWith("Phy"));
        System.out.println(c.endsWith("lls"));


    }
}
