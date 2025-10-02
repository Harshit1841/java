package Module8BasicsofJava;

import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);
        int x = (int)ch;
        System.out.println(x);
//        ASCII Code ; ;
//        'A'= 65; 'a'= 97; '0'=48;
//        'B'= 66; 'b'= 98; '1'=49;
//        'Z'= 90; 'z'= 122; '9'=57;
    }
}
