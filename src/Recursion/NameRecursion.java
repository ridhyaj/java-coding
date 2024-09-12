package Recursion;

public class NameRecursion {
    public static void printName(int n){
        if(n==0){
            return;
        }
        printName(n-1); //head recursion


        System.out.println(n);
        printName(n-1);  //tail recursion
    }

    public static void main( String[] args) {
        printName(5);
    }
}
