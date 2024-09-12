package Recursion;

import java.util.Scanner;
//here stack height will be equal to approx n.
public class CalculatePower {
    public static int power(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int xpownm1=power(x,n-1);
        return x*xpownm1;
    }

    public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int x=s.nextInt();
            int n=s.nextInt();
            System.out.println(power(x,n));
    }
}
