package Recursion;
//calculate x^n with stack height of log n.
//this method of recursion is used to save memory space and to create minimum height of stack as for very big value of power n it will take more memory in stack.

import java.util.Scanner;

public class CalculatePowerLog {
    public static int heightLog(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(n%2==0) {
            return heightLog(x, n / 2) * heightLog(x, n / 2);
        }
        else {
            return heightLog(x, n / 2) * heightLog(x, n / 2)*x;

        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        System.out.println(heightLog(x,n));
    }

}
