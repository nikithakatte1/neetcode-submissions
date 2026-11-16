class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i = 0; i < prices.length -1; i++) {
            for(int j = i; j < prices.length; j++) {
                if(i < j) {
                    max = Math.max(max, (prices[j] - prices[i]));
                }
            }
        }
        return max;
    }
}
