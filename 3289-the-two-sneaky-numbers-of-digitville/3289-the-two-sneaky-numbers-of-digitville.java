class Solution {
    public int[] getSneakyNumbers(int[] nums) {
      HashMap<Integer,Integer> hm=new HashMap<>();
      int[] res=new int[2];
      int p=0;
      int len=nums.length;
      for(int i=0;i<len;i++){
        int cval=nums[i];
        hm.put(cval,hm.getOrDefault(cval,0)+1);
        if(hm.get(cval)==2){
            res[p]=cval;
            p++;
        }
      }  
      return res;
    }
}