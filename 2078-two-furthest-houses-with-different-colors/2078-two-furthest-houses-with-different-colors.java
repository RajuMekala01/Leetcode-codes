class Solution {
    public int maxDistance(int[] colors) {
      int maxdiff=0;
      int n=colors.length;
      for(int i=0;i<n-1;i++){
        if(colors[i]!=colors[n-1]){
            maxdiff=Math.max(maxdiff,n-1-i);
            break;
        }
      }  
      for(int i=n-1;i>=1;i--){
        if(colors[0]!=colors[i]){
            maxdiff=Math.max(maxdiff,i);
            break;
        }
      }
      return maxdiff;
    }
}