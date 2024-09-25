package Recursion;

public class PrintNum {
    public static void testNum(int n){
        if(n==0) {
            return;
        }
            System.out.println(n);
            testNum(n-1);

    }
    public static void main(String[] args) {
        testNum(5);
    }
}
