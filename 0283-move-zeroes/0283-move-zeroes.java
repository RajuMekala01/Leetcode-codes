class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1){
            System.out.println(nums[0]);
        }
        int l=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[l];
                nums[l]=temp;
                l++;
            }
        }
        for(int i:nums){
            System.out.print(i);
        }
    }
}