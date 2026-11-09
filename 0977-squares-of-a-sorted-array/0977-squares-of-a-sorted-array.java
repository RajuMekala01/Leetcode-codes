class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] res=new int[nums.length];
        int l=0;
        int r=nums.length-1;
        for(int p=n-1;p>=0;p--){
            if(Math.abs(nums[l]) > Math.abs(nums[r])){
                res[p]=nums[l]*nums[l];
                l++;
            }
            else{
                res[p]=nums[r]*nums[r];
                r--;
            }
        }






        // for(int i=0;i<nums.length;i++){
        //     res[i]=nums[i]*nums[i];
        // }
        // Arrays.sort(res);
        return res;
    }
}