class Solution {
    public int maxProfit(int[] prices) {
        int cost=0,pro=0,min=prices[0];
        for(int i=1;i<prices.length;i++){
            cost=prices[i]-min;
            pro=Math.max(cost,pro);
            min=Math.min(min,prices[i]);
        }
        return pro;
    }
}