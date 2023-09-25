package LeetCode.Sorting;

public class findMinimum153 {
    public int findMin(int[] nums) {
        int result=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<result){
                result=nums[i];
            }
        }
        return result;
    }
}
