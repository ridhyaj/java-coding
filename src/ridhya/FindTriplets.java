package ridhya;

import java.util.Scanner;

public class FindTriplets {
    boolean find3numbers(int[] A, int arr_size, int sum){
        boolean found = false;
        for (int i = 0; i < arr_size - 2; i++) {
            for (int j = i + 1; j < arr_size - 1; j++) {
                for (int k = j + 1; k < arr_size; k++) {
                    if (A[i] + A[j] + A[k] == sum) {
                        System.out.println(A[i] + ", " + A[j] + ", " + A[k]);
                        found = true;
                    }
                }
            }
        }
        return found;

//        return false;
    }
    public static void main(String[] args) {
        FindTriplets F= new FindTriplets();
        Scanner s=new Scanner(System.in);
        int size, sum;
        size=s.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        sum=s.nextInt();
        F.find3numbers(arr,size,sum);
    }
}
