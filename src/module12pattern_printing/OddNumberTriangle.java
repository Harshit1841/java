package module12pattern_printing;

import java.util.Scanner;

public class OddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row & cols : ");

       int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(2*j-1 +" ");
            }
            System.out.println();
        }
        // Method 2
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=2*i-1; j+=2){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

    }
}







