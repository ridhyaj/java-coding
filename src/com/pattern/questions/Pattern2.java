package com.pattern.questions;

import java.util.Scanner;

public class Pattern2 {
    /*
    pattern:
    * * * *  i=1; j=4-1+1=4;
    * * *    i=2; j=4-2+1=3;
    * *      i=3; j=4-3+1=2;
    *        i=4; j=4-4+1=1;

  */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        for (int i=1;i<=row;i++){
            for(int j=1;j<=row-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
