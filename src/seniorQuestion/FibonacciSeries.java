package seniorQuestion;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n = sc.nextInt();

        int a=0,b=1;

        System.out.println(n);

        for(int i=1;i<=n;i++){
            System.out.print(a +" ");
            int nextTerm = a+b;
            a = b;
            b = nextTerm;
        }
    }
}
