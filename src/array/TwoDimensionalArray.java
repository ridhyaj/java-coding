package array;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//        int[][] a={{2,3,4},{1,2,3},{3,4,5}};
        int[][] a=new int[3][3];
        for (int row=0;row<a.length;row++){
            for (int col=0;col<a[row].length;col++){
                a[row][col]=s.nextInt();
            }
        }
        for (int[] x:a) {
            for (int y:x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
