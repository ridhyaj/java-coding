package array;

import java.util.Scanner;

public class LeftRotation {
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
        int temp=array[0];
//rotation of array to left i.e. shifting first element to last.
//
//        for (int i=0;i<size;i++){
//            if (array[i]==array[size-1]){
//                array[i]=temp;
//            }
//            else {
//                array[i] = array[i + 1];
//            }
//        }
//        for (int x:array){
//            System.out.print(x+" ");
//        }


//another simple approach
for (int i=0;i<array.length-1;i++){
    array[i]=array[i+1];
}
array[array.length-1]=temp;
        for (int x:array){
            System.out.print(x+" ");
        }
    }
}
