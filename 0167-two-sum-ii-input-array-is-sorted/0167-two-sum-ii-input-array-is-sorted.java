class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        int[] res=new int[2];
       while(nums[l]+nums[r] !=target){
        if(nums[l]+nums[r] < target) l++;
        else r--;
       }
       return new int[] {l+1,r+1};
    }
}