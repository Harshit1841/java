package seniorQuestion;

import java.util.Scanner;

public class convertIntToString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
//       int n = sc.nextInt();
        //convert to String no;
//        String s = "";
//        s += n;
        //total number of digits without loop;
//        String s = Integer.toString(n);
        // long use to any length number use to print;
        long n = sc.nextLong();
        String s = Long.toString(n);
        System.out.println(s);
        System.out.println(s.length());
    }
}
