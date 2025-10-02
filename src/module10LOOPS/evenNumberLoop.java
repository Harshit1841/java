package module10LOOPS;

import java.util.Scanner;

public class evenNumberLoop {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int counter=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) {
                counter++;
            }

        }
        if(counter==2){
            System.out.print("Prime number ");
        } else{
            System.out.print(" Not Prime number ");

        }
    }
}
