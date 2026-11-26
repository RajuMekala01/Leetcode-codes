class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
       HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],i);
            }
            int req=target-nums[i];
            if(hm.containsKey(req)){
                res[0]=hm.get(req);
                res[1]=i;
            }
        }


        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             res[0]=i;
        //             res[1]=j;
        //         }
        //     }
        // }
        return res;
    }
}