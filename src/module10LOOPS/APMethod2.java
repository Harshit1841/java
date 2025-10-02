package module10LOOPS;

import java.util.Scanner;

public class APMethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int a=4,d=3;
        for(int i=4;i<=n;i++){
            System.out.println(a);
            a+=d;
        }
    }
}
