class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();

        
        int md=0;
        int cd=0;
        for(int i=0;i<s.length();i++){
            char val=s.charAt(i);
            
            if(val=='('){
                st.push(val);
                cd++;
            }
            if(val==')'){
                md=Math.max(md,cd);
                cd--;
            }   
        }
         return md;
    }
}