package TwoDimensionalArray;

import java.util.Scanner;

public class outputUsingNestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
//        int m = arr.length;
//        int n = arr[0].length;
//        System.out.println(n);
//        System.out.println(m);
        //Input of 2d Array
        for(int i=0;i<3; i++){
            for(int j=0;j<3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



    }
}
