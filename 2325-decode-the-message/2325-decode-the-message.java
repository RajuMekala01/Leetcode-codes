class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> hm=new HashMap<>();
        int c=97;
        String res="";
        for(int i=0;i<key.length();i++){
            char pres=key.charAt(i);
            if(pres!=' ' && !hm.containsKey(pres))
            {
                hm.put(pres,(char) c);
                c++;
            }   
        }
        for(int i=0;i<message.length();i++){
            if(hm.containsKey(message.charAt(i))){
                res+=hm.get(message.charAt(i));
            }
            else if(message.charAt(i)==' '){
                res+=" ";
            }
        }
    return res;
    }
}