package ridhya;
import java.util.Scanner;

class FIndNumberFromMatrices{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[n][n];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= n; j++) {
                    count++;
                    arr[i - 1][j - 1] = count;
                    System.out.print(arr[i - 1][j - 1] + " ");
                }
            } else {
                int temp = n * i;
                for (int j = 1; j <= n; j++) {
                    arr[i - 1][j - 1] = temp;
                    System.out.print(arr[i - 1][j - 1] + " ");
                    temp--;
                }
                count = n * i;
            }
            System.out.println();
        }
        System.out.println(arr[row - 1][col - 1]);
    }
}