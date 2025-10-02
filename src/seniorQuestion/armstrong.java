package seniorQuestion;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n = sc.nextInt();
         int store;

        int NewNumber = n;
        int sum = 0;
        while (n > 0){
            store = n%10;
            sum = sum+store*store*store;
            n = n/10;

        }
        if(sum == NewNumber){
            System.out.println("true");
        }
        else System.out.println("false");
    }
}
