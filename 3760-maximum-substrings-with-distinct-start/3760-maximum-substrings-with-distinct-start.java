class Solution {
    public int maxDistinct(String s) {
      HashMap<Character,Integer> hm=new HashMap<>();
      int res=0;
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        hm.put(c,hm.getOrDefault(c,0)+1);
      }  
      res=hm.size();
      
      return res;
    }
}