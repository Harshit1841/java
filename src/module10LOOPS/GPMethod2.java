package module10LOOPS;

import java.util.Scanner;

public class GPMethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        //method 2
//        int a=1;
//        for(int i=1;i<=n;i++){
//            System.out.println(a);
//            a*=2;
//        }
        //method 1
        for(int i=1; i<= Math.pow(2,n+1); i*=2){
            System.out.println(i);
        }

    }
}
