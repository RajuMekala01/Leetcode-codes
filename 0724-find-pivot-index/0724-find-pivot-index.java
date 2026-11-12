class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int ts=0;
        for(int i=0;i<n;i++){
            ts+=nums[i];
        }
        int ls=0;
        for(int j=0;j<n;j++){
           int rs=ts-ls-nums[j];
            if(ls==rs){
                return j;
            }
            ls+=nums[j];
        }
        return -1;
    }
}