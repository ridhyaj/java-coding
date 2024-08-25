package Sorting;

import java.util.Scanner;
//pick the smallest from unsorted and put it at the beginning;
/*5 4 1 3 2
* 1   5 4 3 2
* 1 2   5 4 3
* 1 2 3   5 4
* 1 2 3 4   5*/

public class SelectionSort {
    public static void Selection(int[] arr){
            for(int i=0;i<arr.length-1;i++){ //n-2 tak chlega
                int min=i;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[min]>arr[j]){
                        min=j;
                    }
                }
                    int temp=arr[min];
                    arr[min]=arr[i];
                    arr[i]=temp;

            }
    }
    public static void printArray(int[] arr){
        for (int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        Selection(arr);
        printArray(arr);
    }
}
