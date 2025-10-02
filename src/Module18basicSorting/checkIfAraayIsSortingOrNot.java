package Module18basicSorting;

public class checkIfAraayIsSortingOrNot {
    public static void main(String[] args) {
        int[] arr = {1,7,3,9,12,13};
        int n = arr.length;
        boolean flag = true;
        for(int i=0;i<n-1;i++){
            if (arr[i] > arr[i+1]) {
                flag = false;
                break;

            }
        }
        if(flag==true) System.out.print("Sorted");
        else System.out.println("Unsorted");

    }

}
