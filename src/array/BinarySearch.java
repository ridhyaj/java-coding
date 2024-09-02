package array;
//to find the element given
//linear searching will give O(n) complexity.
//So we use binary search which has logn complexity where n is the size of the array.

public class BinarySearch {
    public static int FindIndex(int[] arr, int key){
        int index=-1;
        int low=0, high=arr.length-1;
        while (low<high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                index=mid;
                return index;
            }
            else if(key>arr[mid]){
                low=mid+1;
            } else high=mid-1;
        }

        return index;
    }
    public static void main(String[] args) {
        int[] arr={1,5,12,12,45};
        System.out.println("the index is :" + FindIndex(arr,12));
    }
}
