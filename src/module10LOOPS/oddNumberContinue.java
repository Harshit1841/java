package module10LOOPS;

import java.util.Scanner;

public class oddNumberContinue {
    public static void main(String[] args) {
//        Even Number
//        for(int i=1;i<=100;i++){
//            if(i%2==0) System.out.print(i+" ");

//        50 iterations
//        for(int i=1;i<=100;i+=2){
//        System.out.print(i+" ");

//        Odd Number
//        100 iterations (continue)
        for(int i=1;i<=100;i++){
            if(i%2==0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
