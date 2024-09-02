package array;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int[][] a=new int[3][];
        a[0]=new int[2];
        a[1]=new int[3];
        a[2]=new int[4];
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
