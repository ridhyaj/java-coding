package array;

import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner s =new Scanner(System .in);
        int size=s.nextInt();
        int[] array=new int[size];
        for(int i=0;i<array.length;i++){
            array[i]=s.nextInt();
        }
        for (int x:array) {
            System.out.print(x+" ");
        }

        System.out.println();

        //reverse print of array
        for (int i= array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }



        //reverse storing the existing array in new array.
        int[] n_array=new int[size];
        for (int i=0;i<size;i++){
            n_array[i]=array[size-i-1];
        }
        System.out.println();

        for (int x:
             n_array) {
            System.out.print(x+" ");
        }

        System.out.println();







    }
}
