class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int lprice = prices[0];

        for(int i=0; i<prices.length; i++){
            if(prices[i] < lprice){
                lprice = prices[i];
            }
            
            int profit = prices[i] - lprice;
            if( profit > maxprofit){
                maxprofit = profit;
            }
        }

        return maxprofit;
    }
}