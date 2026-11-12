class Solution {
    public int findPeakElement(int[] nums) {
       int n=nums.length;
       int ans=0;
       for(int i=0;i<n-1;i++){
        int r=i+2;
        int mid=i+1;
        if(r==n && nums[mid]>nums[i]){
            ans=mid;
            break;
        }
        if(nums[mid]>nums[i] && nums[mid]>nums[r]){
            ans= mid;
            break;
        }
       }
       return ans;
    }
}