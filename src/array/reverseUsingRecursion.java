package array;
/*
* Methods to reverse an array  can be:
*
* Using an extra array
* Space optimized iteration method
* Recursive method
* Using library function
* */
public class reverseUsingRecursion {
    public static void printArray(int[] arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void reverse(int[] arr){     //space optimized iteration
        int p1=0,p2=arr.length-1;
        while (p1<p2){
            int temp=arr[p2];
            arr[p2]=arr[p1];
            arr[p1]=temp;
            p1++;
            p2--;
        }
        printArray(arr);
    }
    public static void reverseByRecursion(int[] arr, int start, int end){
        if(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            reverseByRecursion(arr,start+1,end-1);
        }
    }
    public static void main(String[] args) {
        int[] arr={2,51,8,4,1,9};
        reverse(arr);
        reverseByRecursion(arr,0,arr.length-1);
        printArray(arr); //we cannot call this method in the reverseByRecursion method as it is recursive.
    }
}
