class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
    
      int leno=order.length;
      int lenf=friends.length;
      Set<Integer> frnd=new HashSet<>();
      for(int i:friends){
        frnd.add(i);
      }
      List<Integer> result=new ArrayList<>();
      for(int o:order){
        if(frnd.contains(o)){
            result.add(o);
        } 
      }
     int[] arr=new int[result.size()];
     for(int i=0;i<result.size();i++){
        arr[i]=result.get(i);
     }
     return arr;
    }
   
}