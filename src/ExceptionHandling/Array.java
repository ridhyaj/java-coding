package ExceptionHandling;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n=s.nextInt();
        int[] array=new int[n];
        for (int i=0;i<array.length;i++){
            array[i]=s.nextInt();
        }
        try{
            int r=array[0]/array[1];
            System.out.println("your answer is : "+r);



//            System.out.println("enter you index to print a particular element: ");
//            int i=s.nextInt();
//            try{
////                System.out.println("enter you index to print a particular element: ");
////                int i=s.nextInt();
//                //can be written anywhere.
//                System.out.println("Your element is : "+array[i]);
//            }
//            catch (ArrayIndexOutOfBoundsException e){
//                System.out.println("Not valid index.");
//            }
        }
        catch (ArithmeticException e){
            System.out.println("Division by 0 not possible.");
        }

        System.out.println("enter you index to print a particular element: ");
        int i=s.nextInt();
        try{
//                System.out.println("enter you index to print a particular element: ");
//                int i=s.nextInt();
            //can be written anywhere.
            System.out.println("Your element is : "+array[i]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Not valid index.");
        }
        finally {
            System.out.println("code ended.");
        }

    }
}
