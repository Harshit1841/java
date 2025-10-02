package Module18basicSorting;

public class bubbleMaxPassesSort2 {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4};
        int n = arr.length;
        print(arr);
        //Bubble Sort -2
//        for(int x=0;x<n-1;x++){
//            for(int i=0;i<n-1-x;i++){
//                if(arr[i]>arr[i+1]){
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                }
//            }
//        }
        //bubble Sort Optimized Code
        for(int x=0;x<n-1;x++){
            boolean flag = true;
            for(int i=0;i<n-1-x;i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = false;
                }
            }
            if(flag==true) break;
        }
        print(arr);
    }
}
