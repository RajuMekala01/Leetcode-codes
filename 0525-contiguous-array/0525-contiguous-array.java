class Solution {
    public int findMaxLength(int[] nums) {
     int maxlen=0;
     int n=nums.length;
     HashMap<Integer,Integer> hm=new HashMap<>();
     hm.put(0,-1);
     int sum=0;
     for(int i=0;i<n;i++){
        if(nums[i]==0){
            sum--;
        }else{
            sum++;
        }
        
        if(hm.containsKey(sum)){
            maxlen=Math.max(maxlen,i-hm.get(sum));
        }else{
        hm.put(sum,i);
        }
     }
     return maxlen;
    }
}