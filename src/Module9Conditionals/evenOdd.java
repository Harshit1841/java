package Module9Conditionals;

import java.sql.SQLOutput;
import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if(n%2 == 0) System.out.println("Even");

        if(n%2 == 1) System.out.println("Odd");

    }

}
