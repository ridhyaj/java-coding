package Sorting;

import java.util.Scanner;

public class BubbleSort {
    //sort the array by moving the larger element to the last by swapping with adjacent elements..
    //It uses the concept of boiling water in which the lower portion of water becomes bubble and comes up.
    //program to sort an array using Bubble Sort.
    //Time Complexity of Bubble Sorting technique is O(n square).
    //This sorting technique is not good.
    //if the array is already sorted it will be not effective.
    public static void Bubble(int[] arr){
        for (int i=0;i<arr.length-1;i++){  //no of turns
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];    //swapping the element if the jth element is larger.
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
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
        Bubble(arr);
        printArray(arr);
    }
}
