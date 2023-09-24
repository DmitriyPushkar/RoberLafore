package LeetCode.Sorting;

public class MissinNumber268 {
    public static int missingNumber(int[] nums) {
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = i;
            for (int k = 0; k < nums.length; k++) {
                if (k==nums.length-1&&nums2[i]!=nums[k]) {
                    return nums2[i];
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
int [] arr=new int[3];
arr[0]=3;
arr[1]=0;
arr[2]=1;
        System.out.println(missingNumber(arr));
    }}
