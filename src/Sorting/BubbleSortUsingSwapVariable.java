package Sorting;

import java.util.Scanner;

import static Sorting.BubbleSort.printArray;

public class BubbleSortUsingSwapVariable {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        BubbleByCountingSwaps(arr);
        printArray(arr);
    }

    private static void BubbleByCountingSwaps(int[] arr) {
        for (int i=0;i<arr.length-1;i++){
            int swaps=0;
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swaps=1;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
            if(swaps==0){
                System.out.println("Array is already sorted");
            }

        }

    }
}
