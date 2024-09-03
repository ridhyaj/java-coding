package array;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    int[] arr=new int[8];
    for(int i=0;i<arr.length;i++){
        arr[i]=input.nextInt();
    }
    for(int x:arr){
        System.out.println(x);
    }
    int sum=0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Sum of all the elements of array is "+sum);
}
}
