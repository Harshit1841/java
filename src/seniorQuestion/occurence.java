package seniorQuestion;
import java.util.*;
public class occurence {
    public static void main(String[] args){
        int[] arr = {1,2,1,2,3,4,3,5};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(Integer num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.print(map);
    }
}
