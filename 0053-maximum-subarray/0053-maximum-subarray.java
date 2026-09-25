class Solution {
    public int maxSubArray(int[] nums) {
        int total=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            total=total+nums[i];
            maxi=Math.max(total,maxi);
            if(total<0) total=0; 
        }
        return maxi;
    }
}