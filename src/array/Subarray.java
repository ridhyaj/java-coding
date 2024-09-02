package array;
//to print the subarrays , its sum, maximum, minimum sum and total number of subarrays.
// all have time complexity of O(n3);
public class Subarray {
    public static void printSubarray(int[] arr){
        int ts=0;
        int n=arr.length;
        int sum=0;
        int max=Integer.MIN_VALUE;   //we cannot take 0 as the sum can also be negative;
        for(int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");  //to print the subarrays
                    sum+=arr[k];   //to find the sum of each subarray.
                }
                System.out.print("sum="+sum);
                if(max<sum){
                    max=sum;
                }
                sum=0;
                ts++;
                System.out.println();

            }
            System.out.println();

        }
        System.out.println(max);
        System.out.println(ts); //n(n+1)/2;
    }
    public static void main(String[] args) {
        int[] arr={1,-2,6,-1,3};
        printSubarray(arr);
    }
}
//after this code go to MaxSubarraySum code in which prefix array (take less time complexity) is used for finding maximum sum;
