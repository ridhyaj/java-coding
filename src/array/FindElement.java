package array;

import java.util.Scanner;
//to find all the occurrences of an element.
public class FindElement {
    public static void elementFind(int[] a,int n,int element){
        boolean found=false;
        for (int i=0;i<n;i++){
            if(a[i]==element){
                System.out.println("element found at index "+i);
                found=true;
            }
        }
        if(!found) {
            System.out.println("Element not found.");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int element=sc.nextInt();
        elementFind(a,n,element);

    }
}
