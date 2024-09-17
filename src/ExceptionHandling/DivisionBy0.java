package ExceptionHandling;

import java.util.Scanner;

public class DivisionBy0 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        double c;
        try{
//            int a=s.nextInt();
//            int b=s.nextInt();
//            double c;
            c= (double) a /b;
            System.out.println("You are answer is : "+c);
        }

        catch (ArithmeticException e){
            System.out.println("Division by zero not possible laude.");
        }

        System.out.println("Or bata kya haal.");
    }
}
