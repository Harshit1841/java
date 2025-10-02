package Module9Conditionals;

import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
//      condition ? if true : if False
        System.out.println((n%2==0) ? " Even" : "odd");
    }
}
