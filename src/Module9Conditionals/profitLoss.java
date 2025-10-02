package Module9Conditionals;

import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost Price : ");
        int cp = sc.nextInt();
        System.out.print("Enter selling Price : ");
        int sp = sc.nextInt();
        if(sp>cp){
            System.out.println("Profit is ");
            System.out.println(sp-cp);
        }
        if(cp>sp) System.out.println("Loss is " +(cp-sp));
        if(sp == cp) System.out.print("no loss no profit");

    }
}
