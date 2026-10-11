class Solution {
    public  boolean checkAnagram(HashMap<Character,Integer>   hma,HashMap<Character,Integer> hmb){
		if(hma.size()!=hmb.size()) return false;
		for(char c:hma.keySet()){
			if(!hmb.containsKey(c)){
				return false;
			}
			int a=hma.get(c);
			int b=hmb.get(c);
			if(a!=b) return false;
		}
		return true; 
	} 




    public List<Integer> findAnagrams(String s, String p) {
        int l=0;
        int n=s.length();
        int n1=p.length();
        List<Integer> ans=new ArrayList<>();
         HashMap<Character,Integer> hmp=new HashMap<>();
        for(int i=0;i<n1;i++){
                char c=p.charAt(i);
                hmp.put(c,hmp.getOrDefault(c,0)+1);
        }   
        HashMap<Character,Integer> hms=new HashMap<>();
            for(int r=0;r<n;r++){
                char ch=s.charAt(r);
                hms.put(ch,hms.getOrDefault(ch,0)+1);

                if(r-l==n1){
                char chl=s.charAt(l);
                hms.put(chl,hms.get(chl)-1);
                if(hms.get(chl)==0){
                        hms.remove(chl);
                }
                 l++;
                }
                    if(r-l+1==n1)
                    checkAnagram(hms,hmp);
                        if(checkAnagram(hms,hmp)){
                                ans.add(l);
                        }                    
            }
            return ans;
    }
 }
