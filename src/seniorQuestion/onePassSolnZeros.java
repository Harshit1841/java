package seniorQuestion;

public class onePassSolnZeros {
    public static void main(String[]args){
        int[] arr={0,0,0,1,1,1};
        int n=arr.length;
        int i=0, j=n-1;
     // One Pass Solution;
        while(i<j){
            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
            if(i>j) break;
            if(arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }



        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }



    }
}
