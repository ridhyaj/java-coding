package array;

public class BinarySearchUsingRecursion {
    public static int recursive(int[] arr, int low, int high,int key){
        if(low>high) return -1;
        int index=-1;
        int mid=(low+high)/2;
       if(key==arr[mid]){
           index=mid;
           return index;
       }
       else if(key>arr[mid]){
           recursive(arr,mid+1,high,key);
       }
       else recursive(arr,low,mid-1,key);
       return index;
    }
//answer shi nhi aarha

    public static void main(String[] args) {
        int[] arr={2,4,6,7,8,8,10};
        System.out.println(recursive(arr,0, arr.length-1,4));
    }
}
