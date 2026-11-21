class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tgas=0;
        int tcost=0;
        for(int i:gas){
            tgas+=i;
        }
        for(int i:cost){
            tcost+=i;
        }
        if(tgas<tcost) return -1;
        int curgas=0;
        int curcost=0;
        int startpoint=0;
        for(int i=0;i<gas.length;i++){
            curgas+=gas[i]-cost[i];
            curcost+=gas[i]-cost[i];
            if(curcost<0){
                curcost=0;
                curgas=0;
                startpoint=i+1;
            }
        }
        if(curgas>=0) return startpoint;
       return -1;
    }
}