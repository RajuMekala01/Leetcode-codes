class Solution {
    public int[] numberGame(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int[] ans=new int[n];
        
        for(int i=0;i<n-1;i+=2){
            int j=i+1;
            ans[i]=nums[j];
            ans[j]=nums[i];
        }
        return ans;













    //    PriorityQueue<Integer> pq=new PriorityQueue<>();
    //    int n=nums.length;
    //    for(int i=0;i<n;i++){
    //     pq.add(nums[i]);
    //    } 
    //    int[] ans=new int[n];
    //    int j=0;
    //    while(pq.size()>0){
    //     int a=pq.poll();
    //     int b=pq.poll();
    //     ans[j]=b;
    //     j++;
    //     ans[j]=a;
    //     j++;
    //    }
    //    return ans;
    }
}