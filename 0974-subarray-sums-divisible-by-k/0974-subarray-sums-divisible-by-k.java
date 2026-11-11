class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int n=nums.length;
       int cnt=0;
       int sum=0;
       for(int i=0;i<n;i++){
        sum+=nums[i];
        int cval=sum%k;
        if(cval<0){
            cval+=k;
        }
        if(hm.containsKey(cval)){
            cnt=cnt+hm.get(cval);
        }
        hm.put(cval,hm.getOrDefault(cval,0)+1);
       }
       return cnt;
    }
      
}