class Solution {
    public int maxProfit(int[] prices) {
        int minValue = prices[0];
        int maxProfit = 0;
        int n = prices.length;

        for(int i=0; i<n; i++) {
            if(prices[i] < minValue) {
                minValue = prices[i];
            }
            else if(prices[i]- minValue > maxProfit ) {
                maxProfit = prices[i] - minValue;
            }
        }
        
        return maxProfit;
        
    }
}
