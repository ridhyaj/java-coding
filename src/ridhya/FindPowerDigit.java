package ridhya;

import java.util.* ;
import java.io.*;
public class FindPowerDigit {
//    public static long power(int x,int n){
//        if(x==0){
//            return 0;
//        }6
//        if(n==0){
//            return 1;
//        }
//        long xpownm1=power(x,n-1);
//        return x*xpownm1;
//    }
    public static int findKthFromRight(int n, int m, int k) {
        // Write your code here.
        long num=(long)Math.pow(n, m);
//        long num=power(n,m);
        int digit=0;
        for(int i=1;i<=k;i++){
            digit=(int)(num%10);
            num=num/10;
        }
        return digit;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int k=s.nextInt();
        System.out.println(findKthFromRight(n,m,k));
    }
}