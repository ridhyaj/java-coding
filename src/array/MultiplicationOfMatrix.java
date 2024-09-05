package array;

import java.util.Scanner;

public class MultiplicationOfMatrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter first matrix size");
        int m=s.nextInt();
        int n=s.nextInt();
        System.out.println("enter second matrix size");
        int p=s.nextInt();
        int q=s.nextInt();
        if (n==p){
            int[][] a=new int[m][n];
            int[][] b=new int[p][q];
            for (int i=0;i<m;i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = s.nextInt();
                }
            }
            for (int i=0;i<p;i++) {
                for (int j = 0; j < q; j++) {
                    b[i][j] = s.nextInt();
                }
            }
            int[][] multiply=new int[m][q];
            
        }
        else {
            System.out.println("the col of first matrix should be equal to the row of second matrix.");
        }

    }
}
