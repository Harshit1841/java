package seniorQuestion;

public class strongNumber {
    public static void main(String[] args){
        int n= 145;
        int sum = 0;
        int x = n;
        while(n != 0){
            int d = n%10;
            int fact = 1;
            for(int i=1; i<=d; i++){
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(x==sum){
            System.out.print("Strong number");
        }else System.out.print("Not Strong Number");
    }
}
