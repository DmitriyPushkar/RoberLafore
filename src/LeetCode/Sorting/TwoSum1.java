package LeetCode.Sorting;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        int temp;
        int sum;
        for(int i=0; i<nums.length; i++){
            temp=nums[i];
            for(int k=i+1; k<nums.length; k++){
                sum=temp+nums[k];
                if(sum==target){
                    int[] arr=new int[2];
                    arr[0]=i;
                    arr[1]=k;
                    return arr;
                }

            }
        }
        return null;

    }
}
