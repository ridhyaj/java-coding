package array;

import java.util.Scanner;

public class SecondMaxElement
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        int second_max=a[0];
        for (int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        for (int i=0;i<n;i++){
            if (second_max<a[i]){
                if (max>second_max & max>a[i]){
                    second_max=a[i];
                }

            }
        }
        System.out.println("the largest element is "+max);
        System.out.println("the second largest element is "+second_max);

    }
}
