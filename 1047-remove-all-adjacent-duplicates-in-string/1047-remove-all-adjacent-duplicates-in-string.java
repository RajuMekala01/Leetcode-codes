class Solution {
    public String removeDuplicates(String s) {
       String ans ="";
       Stack<Character> st=new Stack<>();
       int len=s.length();
       for(int i=0;i<len;i++){
        if(!st.isEmpty() && st.peek()==s.charAt(i)){
            st.pop();
        }else{
            st.push(s.charAt(i));
        }
       } 
       while(!st.isEmpty()){
        ans+=st.pop();
       }
       String res="";
       for(int i=ans.length()-1;i>=0;i--){
        res+=ans.charAt(i);
       }
       return res;
    }
}