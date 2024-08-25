package ridhya;

import java.util.Scanner;


public class PrimeFind {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(isPrime(n))
        System.out.println("yes");
        else System.out.println("false");
    }

    static boolean isPrime(int n) {
        for (int i = 2; i<=n/2; i++) {
            if (n % i == 0) {
                return false;  // as we know return ke baad koi statement nhi chlta sidhe bahr return kr jata
            }
        }
        return true;
    }
}
