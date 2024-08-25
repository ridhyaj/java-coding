package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KTimesRotation {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n=arr.size();
        k=k%n;
        if(k>n){
            return arr;
        }
        int[] temp=new int[k];
        for (int i=n-k;i<n;i++){
            temp[i-n+k]=arr.get(i);
        }
        for (int i=n-k-1;i>=0;i--){
//            arr.add();
            arr.set(i+k,arr.get(i));
        }
        for (int i=0;i<k;i++){
            arr.set(i,temp[i]);
        }
       return arr;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> list=new ArrayList<>(n);
        while(n>0){
            list.add(s.nextInt());
            n--;
        }
        System.out.println(list);
        int k=s.nextInt();
        System.out.println(rotateArray(list,k));

    }
}
