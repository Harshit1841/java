package TwoDimensionalArray;

public class rowWiseAndColWisePrinting {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4},{5,6}};
       int m = arr.length,n = arr[0].length;
        // All no Present in Row
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                System.out.print(arr[i][j]+" ");
//
//            }
//        }
        // transpose
        for(int j=0;j<n;j++){
            for(int i=0;i<m;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
           }
        System.out.println();


            }
        }




