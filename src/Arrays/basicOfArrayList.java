package Arrays;

import java.util.ArrayList;

public class basicOfArrayList {
    public static void main(String[] args) {
//        int[] arr = new int[6];
//        double[] brr = {3.14,2.87,5.6};
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10);
        arr.add(1,20);//initialize
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        System.out.println(arr.size());
//        System.out.println(arr);
        for(int i=0;i<=5;i++){
            System.out.print(arr.get(i)+" ");//arr[i]
        }
        System.out.println();
        arr.set(2,300);// modify
        for(int i=0;i<=5;i++){
            System.out.print(arr.get(i)+" ");//arr[i]
        }
        arr .add(90);// push back
        System.out.println();
        System.out.println(arr.size());
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");//arr[i]
        }
    }
}
