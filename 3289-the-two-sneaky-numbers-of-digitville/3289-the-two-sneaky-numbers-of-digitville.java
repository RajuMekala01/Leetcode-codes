class Solution {
    public int[] getSneakyNumbers(int[] nums) {
      HashMap<Integer,Integer> hm=new HashMap<>();
      int len=nums.length;
      for(int i=0;i<len;i++){
        int cval=nums[i];
        hm.put(cval,hm.getOrDefault(cval,0)+1);
      }  
      
      int count=0;
      for(int k:hm.keySet()){
        if(hm.get(k)>1){
            count++;
        }
      }
      int[] res=new int[count];
      int p=0;
      for(int i:hm.keySet()){
        if(hm.get(i)>1){
            res[p]=i;
            p++;

        }
      }
      return res;
    }
}