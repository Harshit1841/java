package seniorQuestion;

public class mergeTwoSort {
    public static void main(String[] args){
        int[] a = {11,33,42,71};
        int[] b = {26,54,69,81};
        int[] c = new int [a.length + b.length];
        int i=0, j=0, k=0;

        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k] = a[i];
                i++;
            }
            else{
                c[k] = b[j];
                j++;
            }
            k++;
        }
        if(i==a.length){
            while(j<b.length){ //now take elements from b only
                c[k]=b[j];
                j++; k++;
            }
        }
        if(j==b.length){
            while(i<a.length){ //now take elements from a only
                c[k]=a[i];
                i++; k++;
            }
        }
        for(int ele : c){
            System.out.print(ele+" ");
        }


    }
}
