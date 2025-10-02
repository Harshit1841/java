package Module15strings;

public class subString {
    public static void main(String[] args) {
        String s = "abcde";
//        System.out.println(s.substring(3));
//        System.out.println(s.substring(1, 4));
//        System.out.println(s.substring(2, 2));
//        System.out.println(s.substring(0, 5));
//        System.out.println();
        // print all substrings
//        for (int i = 1; i <= 5; i++) {
//            System.out.print(s.substring(0, i) + " ");
            //nested loop (loop ke ander loop)
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j <= 5; j++) {
                    System.out.print(s.substring(i, j) + " ");
                }
                System.out.println();
            }
        }

    }

