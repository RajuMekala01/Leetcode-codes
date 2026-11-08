class Solution {
    public int balancedStringSplit(String s) {
       int ans=0;
       int cnt=0;
       int n=s.length();
       for(int i=0;i<n;i++){
        int val=s.charAt(i);
        
        if(val=='L'){
            cnt++;
            
        }else{
            cnt--;
        }
       if(cnt==0){
        ans++;
       }
       } 
       return ans;
    }
}