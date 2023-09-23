package LeetCode.BinarySearch;

public class SearchInsertPosition35 {
    public static int searchInsert(int[] nums, int target) {
        int lowerBound=0;
        int upperBound=nums.length-1;
        int mid;
        while(true){
            mid=(lowerBound+upperBound)/2;
            if(nums[mid]==target){
                return mid;
            } else if(lowerBound>upperBound){
                return lowerBound;
            }else{
                if(nums[mid]<target){
                    lowerBound=mid+1;
                }else{
                    upperBound=mid-1;
                }
            }
        }
    }

    public static void main(String[] args) {

         int[] arr=new int[4];
         arr[0]=1;
         arr[1]=4;
         arr[2]=9;
         arr[3]=10;
        System.out.println(searchInsert(arr,8));


    }
}
