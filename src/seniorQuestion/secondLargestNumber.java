package seniorQuestion;

public class secondLargestNumber {
    public static void main(String[] args){
        int[] arr = {-10,-8,430,12,-5234,-56};
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            mx = Math.max(mx,arr[i]);
        }
        int smx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != mx)
                smx = Math.max(smx,arr[i]);
        }
        System.out.println(mx);
        System.out.println(smx);
    }
}
