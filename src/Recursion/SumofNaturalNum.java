package Recursion;

public class SumofNaturalNum {
    public static int sum(int n) {
        int result=0;
        if (n > 0) {
            return n + sum(n - 1);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
