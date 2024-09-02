package array;

import java.util.Scanner;

public class Declare {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //int[] arr; // this is standard java type array declaration.
        //int arr[]; //this can also be used but this is c++ type declaration.
        //arr=new int[5];
        // we can also directly initialize and assign the size int the same line.
//        int[] arr={1,2,3,3,4,9}; either Declare with element.
        int[] arr=new int[5];
        for (int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for (int j : arr) {
            System.out.println(j + " ");
        }
    }
}
