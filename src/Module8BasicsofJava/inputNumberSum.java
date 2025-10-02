package Module8BasicsofJava;

import java.util.Scanner;

public class inputNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two Number : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x+y);
    }
}
