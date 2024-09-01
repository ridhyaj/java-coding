package array;

import java.util.Scanner;

public class AdditionOfMatrices {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int[][] a=new int[m][n];
        int[][] b=new int[m][n];
        for (int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = s.nextInt();
            }
        }
        for (int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = s.nextInt();
            }
        }
        int[][] sum=new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        for (int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
