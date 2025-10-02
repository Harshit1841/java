package module12pattern_printing;

import java.util.Scanner;

public class smallalphabetSquare1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row & cols : ");

        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(i+96)+" ");
            }
            System.out.println();
        }
    }
}



