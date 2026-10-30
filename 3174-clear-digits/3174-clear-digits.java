class Solution {
    public String clearDigits(String s) {
        Stack<Character> st =new Stack<>();
        for(int i=0;i<s.length();i++){
             char ch=s.charAt(i);
             if(ch>='a' && ch<='z'){
                st.push(ch);
             }else{
                st.pop();
             }
        }
        String sb="";
        for(int i:st){
            sb+=(char)i;
        }
         return sb;
    }
}