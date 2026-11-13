class Solution {
    public int shipWithinDays(int[] weights, int days) {
      int mincap=0;
      int maxcap=0;
      for(int i:weights){
        mincap=Math.max(mincap,i);
        maxcap=maxcap+i;
      }

        while(mincap<maxcap){
            int mid=mincap+(maxcap-mincap)/2;
            int d=1;
            int sum=0;
            for(int weight:weights){
                if(sum+weight>mid){
                    d++;
                    sum=0;
                }
                sum+=weight;
            }
            if(d>days){
                mincap=mid+1;
            }else{
                maxcap=mid;
            }
        }
        return mincap;
    }
}