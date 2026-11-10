class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int r=n-1;
        int l=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                int temp=nums[i];
                nums[i]=nums[l];
                nums[l]=temp;
                l++;
            }
        }
       return l; 
    }
}