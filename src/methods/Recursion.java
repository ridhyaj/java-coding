package methods;

import java.util.Scanner;

public class Recursion {
    static long factorial(int n){
        long result=1;
        if(n>0) {
            result = n * factorial(n - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter a number to find its factorial: ");
        int num=s.nextInt();
        System.out.println("factorial of "+num+" is "+factorial(num)+".");
    }
}
