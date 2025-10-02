package Arrays;

public class maxInArray {
    public static void main(String[] args) {
        int[] arr = {10,8,430,12,56,3,78};
        int n = arr.length;
        int mx = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>mx) mx = arr[i];
        }
        System.out.println(mx);
    }
}
