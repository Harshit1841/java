package module10LOOPS;

public class infiniteLoop {
    public static void main(String[] args) {
//        infinite Loop
//        while('a'<'b')
//            System.out.println("malayalam is a palindrom");
        int x=4,y=0;
        while(x>=0){
            x--;
            y++;
            if(x==y)
                continue;
            else
                System.out.println(x+" "+y);
        }


        }

    }

