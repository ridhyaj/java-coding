package array;
//To find maximum subarray sum using prefix array;
//time complexity:
public class MaxSubarraySum {
    public static void maxSum(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i] += arr[j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {

                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,-2,6,-1,3};

    }
}
