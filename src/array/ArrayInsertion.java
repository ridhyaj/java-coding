package array;

import java.util.Scanner;

//public class InsertElementByShifting {
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter the size of the array:");
//        int n=s.nextInt();
//        int[] array=new int[n];
//        System.out.println("Enter the elements of the array:");
//        for (int i=0;i<n;i++){
//            array[i]=s.nextInt();
//        }
//        System.out.println("The elements are:");
//        for (int x:array){
//            System.out.print(x+", ");
//        }
//        System.out.println("Enter the element to store in the array:");
//        int ele=s.nextInt();
//        System.out.println("Enter the place where to insert the element:");
//        int index=s.nextInt();
//
//        int temp;
//        for(int i=0;i<n;i++){
//            if(i==index){
//                    while (i<n){
//                    temp=array[i];
//                    array[i++]=temp;
//                }
//
//            }
//
//        }
//        array[index]=ele;
//        System.out.println("The elements are:");
//        for (int x:array){
//            System.out.print(x+", ");
//        }
//    }
//}

public class ArrayInsertion {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=s.nextInt();
        int[] array=new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i=0;i<n;i++){
            array[i]=s.nextInt();
        }
        System.out.println("The elements are:");
        for (int x:array){
            System.out.print(x+", ");
        }
        System.out.println("Enter the element to store in the array:");
        int elementToInsert=s.nextInt();
        System.out.println("Enter the place where to insert the element:");
        int indexToInsertAt=s.nextInt();

        array = insertElement(array, elementToInsert, indexToInsertAt);

        // Print the modified array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static int[] insertElement(int[] arr, int element, int index) {
        int[] newArray = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArray.length; i++, j++) {
            if (i == index) {
                newArray[i] = element;
                j--; // To compensate for the extra iteration
            } else {
                newArray[i] = arr[j];
            }
        }
        return newArray;
    }
}
