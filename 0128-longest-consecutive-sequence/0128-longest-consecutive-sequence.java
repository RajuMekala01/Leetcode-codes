class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }
        int longest = 0;

        for (int n : numSet) {
            if (!numSet.contains(n - 1)) {
                int length = 1;

                while (numSet.contains(n + length)) {
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }
        return longest;

    //  int n=nums.length;
    //  if(n==0) return 0;
    //  if(n==1) return 1;
    //  Arrays.sort(nums);
    //  int ans=0;
    //  int cans=1;
    //  for(int i=0;i<n-1;i++){
    //     int j=i+1;
    //     if((nums[j]-nums[i])==1){
    //         cans+=1; 
    //     }
    //     else if((nums[j]-nums[i])==0){
    //         cans+=0;
    //     }
    //     else{
    //         cans=1;
    //     }
    //      ans=Math.max(ans,cans);
    //  }
    //  return ans;

    }
}