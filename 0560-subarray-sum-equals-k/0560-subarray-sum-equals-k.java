class Solution {
    public int subarraySum(int[] nums, int k) {
    HashMap<Integer,Integer> hm=new HashMap<>();
    hm.put(0,1);
      int n=nums.length;
      int sum=0;
      int cnt=0;
      for(int i=0;i<n;i++){
        sum=sum+nums[i];
        if(hm.containsKey(sum-k)){
            cnt=cnt+hm.get(sum-k);
        }
         hm.put(sum,hm.getOrDefault(sum,0)+1);
        
      }
      return cnt;
    }
}