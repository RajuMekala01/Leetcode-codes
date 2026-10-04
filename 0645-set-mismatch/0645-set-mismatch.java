class Solution {
    public int[] findErrorNums(int[] nums) {
    HashSet<Integer> hs=new HashSet<>();
        int dup=-1;
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(!hs.contains(val)){
                hs.add(val);
            }
            else{
                dup=val;
            }
        }
        int mis=-1;
        for(int j=1;j<nums.length+1;j++){
           if(!hs.contains(j)){
               mis=j;
           }
       }
       int[] res={dup,mis};
       return res;
    }
}