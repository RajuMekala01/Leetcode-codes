class Solution {
    public void rotate(int[] nums, int k) {
     int n=nums.length;
      int l=k%n;
      int rv=n-l;
      int[] res=new int[n];
      int idx=0;
      for(int i=rv;i<n;i++){
        res[idx]=nums[i];
        idx++;
      }
      for(int j=0;j<rv;j++){
        res[idx]=nums[j];
        idx++;
      }
      for(int i=0;i<n;i++){
        nums[i]=res[i];
      }
    }
}