package LeetCode.Sorting;

public class ProductOfArray238 {
    public static int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        int temp=1;
        for(int i=0; i<nums.length; i++){
            result[i]=temp;
            temp*=nums[i];
        }
        temp=1;
        for(int i=nums.length-1; i>=0; i--){
            result[i]*=temp;
            temp*=nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr=new int[4];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        productExceptSelf(arr);

    }
}
