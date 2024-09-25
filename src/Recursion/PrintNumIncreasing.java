package Recursion;

import java.util.Scanner;

public class PrintNumIncreasing {
    public static void printNum(int n){
        if(n<1)return;
        printNum(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        printNum(n);
    }
}
