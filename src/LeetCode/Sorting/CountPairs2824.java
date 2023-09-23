package LeetCode.Sorting;

import java.util.ArrayList;
import java.util.List;

public class CountPairs2824 {
    public static int countPairs(List<Integer> nums, int target) {
        int pairs=0;
        for(int i=0; i<nums.size(); i++){
            for(int k=i+1; k<nums.size();k++){
                if(nums.get(i)+nums.get(k)<target){
                    pairs++;
                }
            }
        }
        return pairs;

    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(-6);
        list.add(2);
        list.add(5);
        list.add(-2);
        list.add(-7);
        list.add(-1);
        list.add(3);
        System.out.println(countPairs(list,-2));

    }
}
