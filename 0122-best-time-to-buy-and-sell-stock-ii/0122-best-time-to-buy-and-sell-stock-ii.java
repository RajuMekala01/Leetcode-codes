class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int n=prices.length;
        for(int i=0;i<n-1;i++){
            int cp=-(prices[i]-prices[i+1]);
            if(cp>0){
                profit+=cp;
            }
        }
        return profit;
    }
}