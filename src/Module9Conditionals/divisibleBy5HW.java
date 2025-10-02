package Module9Conditionals;

import java.util.Scanner;

public class divisibleBy5HW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No : ");
        int n = sc.nextInt();

        if(n%5 == 0)System.out.println("True");
        else System.out.println("False");


    }

}
