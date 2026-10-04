class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
     HashMap<Character,Integer> hmag=new HashMap<>();
     HashMap<Character,Integer> hran=new HashMap<>();
     int len=magazine.length();
     int len1=ransomNote.length();
    

    for(int i=0;i<len;i++){
        char c=magazine.charAt(i);
        hmag.put(c,hmag.getOrDefault(c,0)+1);
    }

    for(int i=0;i<len1;i++){
        char c1=ransomNote.charAt(i);
        hran.put(c1,hran.getOrDefault(c1,0)+1);
    }

    for(Character i: hran.keySet()){
        if(!hmag.containsKey(i) || hmag.get(i) < hran.get(i)){
            return false;
        }
    }
    return true;
    }
}