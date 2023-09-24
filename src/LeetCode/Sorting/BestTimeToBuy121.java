package LeetCode.Sorting;

public class BestTimeToBuy121 {
    public static int maxProfit(int[] prices) {
        int minCost=Integer.MAX_VALUE;
        int profit=0;
        int difference;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<minCost){
                minCost=prices[i];
            }
            difference=prices[i]-minCost;
            if(profit<difference){
                profit=difference;
            }
        }
        return profit;

    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,4,2};
        maxProfit(arr);
    }
}
