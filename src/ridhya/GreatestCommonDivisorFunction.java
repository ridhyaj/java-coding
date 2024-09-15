package ridhya;

import java.util.Scanner;

public class GreatestCommonDivisorFunction {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        while (m!=n){
            if (m > n) m = m - n;
             else n = n - m;
        }
        System.out.println(m);
    }
}
