package array;

import java.util.Scanner;

public class RightRotation {
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

        //rotation of array to left i.e. shifting first element to last.

        int temp=array[size-1];
        int[] n_array=new int[size];
        //here we have to take new array because in shifting right the previous elements get changed and then cannot be used.
        //so we stored the new value in new array and used the previous element of array which was not changed.
        for (int i=0;i<size;i++){
if (array[i]==array[0]){
    n_array[i]=temp;
}
else {
    n_array[i] = array[i - 1];
}
        }
        for (int x:n_array){
            System.out.print(x+" ");
        }
    }
}
