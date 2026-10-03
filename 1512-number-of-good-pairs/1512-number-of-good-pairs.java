class Solution {
    public int numIdenticalPairs(int[] nums) {
      int n=nums.length;
      HashMap<Integer,Integer> hm=new HashMap<>();
      int ans=0;
      for(int i=0;i<n;i++){
        if(hm.containsKey(nums[i])){
            ans+=hm.get(nums[i]);
            hm.put(nums[i],hm.get(nums[i])+1);
        }
        else{
            hm.put(nums[i],1);
        }
      }
      return ans;

    }
}