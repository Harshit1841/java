package Module20Recursion;

import java.util.ArrayList;

public class subsetsOfString {
    static ArrayList<String> arr = new ArrayList<>();
    public static void printSubsets(int i, String s, String ans){
        if(i==s.length()){
            arr.add(ans);
            return;
        }
        printSubsets(i+1,s,ans);
        ans += s.charAt(i);
        printSubsets(i+1,s,ans);
    }
    public static void main(String[] args){
        String s = "abcd";
        arr = new ArrayList<>();
        printSubsets(0,s,"");
        System.out.println(arr);
    }
}
