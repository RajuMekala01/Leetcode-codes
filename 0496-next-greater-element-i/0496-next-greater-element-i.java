class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        int[] res=new int[nums2.length];
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=-1;
            }else{
                res[i]=st.peek();
            }
            st.push(nums2[i]);
            hm.put(nums2[i],res[i]);
        }
        int[] ans=new int[nums1.length];
       for(int i=0;i<nums1.length;i++){
            if(hm.containsKey(nums1[i])){
                ans[i]=hm.get(nums1[i]);
            }
       }
       return ans;
    }
}