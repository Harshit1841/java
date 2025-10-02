package module12pattern_printing;

public class starRectangle {
    public static void main(String[]args){
        for(int i=1;i<=4;i++){ //rows
            for(int j=1;j<=5;j++){ //cols
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
