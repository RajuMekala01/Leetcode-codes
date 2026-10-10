class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int ans=0;
        int l=0;
        int n=fruits.length;
        for(int r=0;r<n;r++){
            int val=fruits[r];
            hm.put(val,hm.getOrDefault(val,0)+1);

            while(hm.size()>2){
                int tval=fruits[l];
                hm.put(tval,hm.get(tval)-1);
                if(hm.get(tval)==0){
                    hm.remove(tval);
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}