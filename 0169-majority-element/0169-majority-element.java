class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int res=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            int cval=nums[i];
            hm.put(cval,hm.getOrDefault(cval,0)+1);
        }
        for(int val:hm.keySet())
        {
            if(hm.get(val)>n/2)
             res=val;
        }
      return res;  
    }
}