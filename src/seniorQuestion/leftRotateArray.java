package seniorQuestion;

public class leftRotateArray {
    public static void main(String[] args){
        int[] arr= {11,12,13,14,15};
        int n = arr.length;
        int temp = arr[0];
        for(int i=1; i<n; i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        System.out.print("Array after left rotation: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
