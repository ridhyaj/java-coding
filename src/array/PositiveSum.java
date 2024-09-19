package array;

import java.util.Scanner;

public class PositiveSum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int sum=0;
        try {
            for (int x: arr) {
                if (x<0){
                    break;
                }
                else {
                    sum+=x;
                }

            }
        }
        catch (Exception e){
            System.out.println("Negative number found at");
        }
        System.out.println(sum);
    }
}
