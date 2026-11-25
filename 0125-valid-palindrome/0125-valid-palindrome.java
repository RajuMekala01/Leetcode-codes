class Solution {
    public boolean isPalindrome(String s) {
        String r="";
       String m= s.toLowerCase();
        for(int i=0;i<m.length();i++){
            char ch=m.charAt(i);
            if(ch>=97 && ch<=122 || ch>=48 && ch<=57){
                r+=ch;
            }
            
        }
        if(r.length()==0){
            return true;
        }
        char[] vals=r.toCharArray();
        int f=0;
        int l=vals.length-1;
        while(f<=l){
            if(vals[f]!=vals[l]){
                return false;
            }else{
                f++;
                l--;
            }
        }
        return true;
    }
}