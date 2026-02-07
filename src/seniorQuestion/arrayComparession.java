package seniorQuestion;

public class arrayComparession {
    public static void main(String[] args){
        int[] arr = {1,2,1,3,3,4,5};
        int n = arr.length;
        String ans = "";
        int i=0, j=0;
        while(j<arr.length){
            if(arr[j]==arr[i]) j++;
            else{
                ans += arr[i];
                int len = j-i;
                if(len>1) ans +=len;
                i=j;

            }
        }
        ans += arr[i];
        int len = j-i;
        if(len>1) ans +=len;
        System.out.print(ans);
    }
}
