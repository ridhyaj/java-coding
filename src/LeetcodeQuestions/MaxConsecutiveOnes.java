package LeetcodeQuestions;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int number=0;
        for(int i=0;i<nums.length;i++){

            if(nums[i]!=1){
                count=0;
            }else   count++;

            if(number<count){
                number=count;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
