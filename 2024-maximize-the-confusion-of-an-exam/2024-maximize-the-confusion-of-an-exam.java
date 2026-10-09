class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n=answerKey.length();
        int l=0;
        int cntT=0;
        int cntF=0;
        int ans=0;
        for(int r=0;r<n;r++){
            char cval=answerKey.charAt(r);
            if(cval=='T'){
                cntT++;
            }
            else{
                cntF++;
            }
            while(Math.min(cntT,cntF)>k){
                char cval2=answerKey.charAt(l);
                if(cval2=='T'){
                    cntT--;
                }else{
                    cntF--;
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}