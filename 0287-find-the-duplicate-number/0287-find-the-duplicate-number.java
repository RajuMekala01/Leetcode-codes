class Solution {
    public int findDuplicate(int[] nums) {
       Arrays.sort(nums);
       int s=0;
       int n=nums.length;
       for(int i=1;i<n;i++){
            if(nums[i]==nums[s]){
                return nums[i];
            }
            else{
                s++;
            }
       }
       return 0;
    }
}