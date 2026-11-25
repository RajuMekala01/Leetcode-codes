class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
       int f=0;
       int l=s.length()-1;
       while(f<=l){
        char ch=s.charAt(f);
        char ch1=s.charAt(l);
        if(!Character.isLetterOrDigit(ch)){
            f++;
        }
        else if(!Character.isLetterOrDigit(ch1)){
            l--;
        }
        else{
            if(Character.toLowerCase(ch)!=Character.toLowerCase(ch1)){
                return false;
            }
            f++;
            l--;
        }
       }
       return true;
    }
}