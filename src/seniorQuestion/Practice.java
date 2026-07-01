package seniorQuestion;

public class Practice {
    public static void main(String[]args){
        int[] arr = {3,0,5,4,9,2};
        int x =10;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; i<arr.length; j++){
                if(arr[i]+arr[j]==x){
                    System.out.print(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
