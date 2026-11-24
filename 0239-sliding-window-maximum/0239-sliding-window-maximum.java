class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

       
        int[] res = new int[nums.length-k+1];
        Deque<Integer> d = new ArrayDeque();
        int index = 0;
        for(int i=0; i<nums.length; i++) {
            if(!d.isEmpty() && d.peekFirst() <= i-k) {//check expired
                d.pollFirst();
            }
             while(!d.isEmpty() && nums[d.peekLast()] <= nums[i]) {//remove smaller elements
                d.pollLast();
            }
            d.offerLast(i);
            if(i >= k-1) {//check window size stores max
                res[index] = nums[d.peekFirst()];
                index++;
            } //return res
        }
    return res;
    }
}

















        // int[] res=new int[nums.length-k+1];
        // int idx=0;
        // for(int i=0;i<nums.length-k+1;i++){
        // int max=Integer.MIN_VALUE;
        // for(int j=i;j<k+i;j++){
        //     max=Math.max(max,nums[j]);
        // }
        // res[idx]=max;
        // idx++;
        // }
        // return res;
