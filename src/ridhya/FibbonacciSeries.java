package ridhya;

import java.util.Scanner;

public class FibbonacciSeries {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(fib(n));
    }
    static int fib(int n){
        if(n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }
}
