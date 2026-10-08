class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int ans=0;
        int l=0;
        int n=arr.length;
        int val=0;
        for(int r=0;r<n;r++){
           int temp=arr[r];
           val+=temp;
            if(r-l+1==k){
                if(val/k>=threshold){
                    ans++;
                }
                val-=arr[l];
                l++;
            }

        }
        return ans;
    }
}