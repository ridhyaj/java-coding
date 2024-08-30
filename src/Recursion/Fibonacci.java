package Recursion;

import java.util.Scanner;

public class Fibonacci {

    //for printing the nth term only
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fn1=fib(n-1);
        int fn2=fib(n-2);
        int fn=fn1+fn2;
        return fn;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int term=s.nextInt();
        System.out.println(fib(term));
    }













// for print from 0th term to nth term.
//    public static void printFib(int a,int b,int n){
//        if(n==0){
//            return;
//        }
//        int c=a+b;
//        System.out.println(c);
//        printFib(b,c,n-1);
//    }
//
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int n= s.nextInt();
//        int a=0;
//        int b=1;
//        System.out.println(a);
//        System.out.println(b);
//        printFib(a,b,n-2);
//    }
}
