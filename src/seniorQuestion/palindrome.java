package seniorQuestion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int n,s=0,c,r;
        n=sc.nextInt();
        c=n;
        while(n>0){
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(c==s)
            System.out.println("palindrome Number");
        else System.out.println("Not Palindrome Number");
    }
}
