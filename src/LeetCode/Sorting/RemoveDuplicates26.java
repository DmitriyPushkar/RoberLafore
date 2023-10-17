package LeetCode.Sorting;

public class RemoveDuplicates26 {
    public  static int removeDuplicates(int[] nums) {
        int [] nums2=new int[nums.length];
        int k=0;
        for(int i=0; i<nums.length; i++){
            if(i<nums.length-1&&nums[i]!=nums[i+1]){
                nums2[i]=nums[i];
                k++;
            }
        }
        for(int i=0; i<nums.length; i++){
            nums[i]=nums2[i];
        }
        return k;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{-1, 0, 3};
        System.out.println(removeDuplicates(arr));
    }
}
