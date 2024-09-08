package array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMax {
    static int sortMethod(int[] arr){
        Arrays.sort(arr);
        for (int i=arr.length-1;i>0;i--){
            if(arr[i]!=arr[arr.length-1]){
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int max,s_max;
        max=arr[0];
        s_max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if(arr[i]>max){
                s_max=max;
                max=arr[i];
            }
            else if(arr[i]>s_max && arr[i]!=max){
                s_max=arr[i];
            }

        }
        System.out.println(s_max);
        System.out.println(sortMethod(arr));

    }
}


/*
package array;
public class SecondLargestElement {
    public static void main(String[] args) {
        int[] array = {44, 22,33, 22, 44,33};

        int secondLargest = findSecondLargest(array);

        System.out.println("Second Largest Element: " + secondLargest);
    }

    static int findSecondLargest(int[] array) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}

 */