package Recursion;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {
    public static int printMax(int[] arr,int size){
        return arr[size-1];
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        for (int x:arr){
            System.out.println(x);
        }
        System.out.println(printMax(arr,n));
    }
}
