package array;

import java.util.Arrays;
import java.util.Scanner;

class KthSmallestLargest {
     static void kthSmallestLargest(int[] arr,int n,int k){
         Arrays.sort(arr);
         System.out.println(arr[k-1]);
         System.out.println(arr[n-k]);

     }

     public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         int t = s.nextInt();
         while (t > 0) {
             int n = s.nextInt();
             int k = s.nextInt();

             int[] arr = new int[n];
             for (int i = 0; i < n; i++) {
                 arr[i]=s.nextInt();
             }
             kthSmallestLargest(arr,n,k);
             t--;
         }
     }
}
