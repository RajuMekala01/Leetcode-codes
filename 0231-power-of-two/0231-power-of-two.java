class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean isPow=false;
    if(n==1) return true;
      for(int i=0;i<31;i++){
        if(Math.pow(2,i)==n){
            isPow=true;
            break;
        }
      }  
      return isPow;
    }
}