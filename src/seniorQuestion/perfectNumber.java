package seniorQuestion;

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args){
        int n;
        int sum = 0;
        System.out.print("Enter any Number: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(n==sum){
            System.out.print("Perfect Number");
        }else System.out.print("Not Perfect Number");

    }
}
