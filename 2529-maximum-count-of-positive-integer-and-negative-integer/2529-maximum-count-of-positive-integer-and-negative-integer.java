class Solution {
static int leftMost(int[] nums){
    int n=nums.length;
        int l=0;
        int r=nums.length-1;
        int t=0;
        while(l<=r){
            int m=(l+r)/2;
            if(nums[m]>=t){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return l;
}
static int rightMost(int [] nums){
    int n=nums.length;
        int l=0;
        int r=nums.length-1;
        int t=1;
        while(l<=r){
            int m=(l+r)/2;
            if(nums[m]>=t){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return l;
}

    public int maximumCount(int[] nums) {
        int lm=leftMost(nums);
        int rm=nums.length-rightMost(nums);
        int ans=Math.max(lm,rm);
        return ans;
    }
}