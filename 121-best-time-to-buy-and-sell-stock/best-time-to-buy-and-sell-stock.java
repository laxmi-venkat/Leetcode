class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
       int maxPro = 0;
       int miniPrice = Integer.MAX_VALUE;
       for(int i= 0;i<n;i++){
            miniPrice = Math.min(miniPrice,prices[i]);
            maxPro = Math.max(maxPro,prices[i]-miniPrice);
       } 
       return maxPro;
    }
}