package array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumberCS{
    public static int[] getSecondOrderElements(int n, int[] a) {
        // Write your code here.
        int lar = a[0];
        int secondLar = a[0];
        int small = a[0];
        int secondSmall = a[1];
        for (int i = 0; i < n; i++) {
            if (a[i] > lar) {
                secondLar = lar;
                lar = a[i];

            }
            else if(a[i]>secondLar && a[i]!=lar){
                secondLar=a[i];
            }

            if (a[i] < small) {
                secondSmall = small;
                small = a[i];

            }
            else if(a[i]<secondSmall && a[i]!=small){
                secondSmall=a[i];
            }
        }
        int[] arr = new int[2];

        arr[0] = secondLar;
        arr[1] = secondSmall;
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(getSecondOrderElements(n, arr)));
    }
}