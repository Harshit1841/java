package module10LOOPS;

import java.util.Scanner;

public class AP2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
//        series nth term : a,a+d,a+2d------a+(n-1)d
//        formula : an= a+(n-1)d
        for(int i=4;i<=3*n+1;i+=3){
            System.out.println(i);

        }
    }
}
