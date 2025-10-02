package Module15strings;

import java.util.Scanner;

public class convertInToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        String s = "" + n;

        System.out.println(s);
    }
}
