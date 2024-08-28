package com.pattern.questions;

import java.util.Scanner;

public class Pattern1 {
/*
    pattern :
    *          i=1;
    * *        i=2;
    * * *      i=3;
    * * * *    i=4;
 */
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int row=s.nextInt();
    for(int i=1;i<=row;i++){
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
}
