package LeetCode.BinarySearch;

public class BinarySearch704 {
    public static int search(int[] nums, int target) {
        int lowerBound=0;
        int upperBound=nums.length-1;
        int mid;
        while(true){
            mid=(lowerBound+upperBound)/2;
            if(nums[mid]==target){
                return mid;
            }else if(lowerBound>upperBound){
                return -1;
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
        System.out.println(search(arr,9));

    }
}
