class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<2) return 0;
        int left =0;
        int right =1;
        int profit=Math.max(0,prices[right]-prices[left]);
        while(right<prices.length-1){
            if(prices[left]>prices[right]){
                left=right;
                right++;
                profit=Math.max(profit,prices[right]-prices[left]);
            }
            else{
                right++;
                profit=Math.max(profit,prices[right]-prices[left]);
            }
        }
        return profit;
    }
}
