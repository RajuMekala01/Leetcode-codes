class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double max=Integer.MIN_VALUE;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        max=sum;
        int x=0;
        for(int j=k;j<nums.length;j++){
            sum=sum-nums[x];

            sum=sum+nums[j];
            max=Math.max(sum,max);
            x++;
        }
        return max/k;
    }
}