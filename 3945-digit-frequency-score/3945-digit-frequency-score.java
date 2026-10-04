class Solution {
    public int digitFrequencyScore(int n) {
      HashMap<Integer,Integer> hm=new HashMap<>();
      int digit=0;
      int sum=0;
      while(n>0){
        digit=n%10;
        hm.put(digit,hm.getOrDefault(digit,0)+1);
        n=n/10;
        digit=0;
      } 
      for(int i:hm.keySet()){
        sum+=i*hm.get(i);
      }
     return sum;
    }
    
}