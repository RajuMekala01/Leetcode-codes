class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
    int[] res=new int[friends.length];
    int k=0;
      int len=order.length;
      int lenf=friends.length;
      for(int i=0;i<len;i++){
        for(int j=0;j<lenf;j++){
            if(order[i]==friends[j]){
                res[k]=order[i];
                k++;
                break;
            }
        }
      }  
      return res;
    }
}