package seniorQuestion;

import java.util.ArrayList;

public class basicOfArrayList {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10);
        arr.add(1,20);// add means initialize
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
//        System.out.print(arr);
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");//get means print arr[i]
        }
        System.out.println();
        arr.set(2,300);// modify
        System.out.print(arr);
        System.out.println();
        arr.add(90);//push back
        System.out.print(arr);
    }
}
