package Module15strings;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        String s = "raghav";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for(char ele : ch){
            System.out.print(ele);
        }
        System.out.println();

    }
}
