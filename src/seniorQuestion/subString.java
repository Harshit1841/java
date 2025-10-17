package seniorQuestion;

public class subString {
    public static void main(String[] args){
        String s = "abcde";
//        System.out.println(s.substring(1));//bcde
//        System.out.println(s.substring(1,4));//bcd
//        System.out.println(s.substring(2,2));// empty
//        System.out.println(s.substring(0,5));//abcde

        //substring();

        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
