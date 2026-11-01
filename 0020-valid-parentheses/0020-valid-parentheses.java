class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 !=0) return false;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char val=s.charAt(i);
            if(val=='(' || val=='{'||val=='['){
                st.push(val);
            }
            else{
                if(st.isEmpty()) return false;
                char top=st.pop();
                if(val==')' && top!='(') return false;
                if(val=='}' && top!='{') return false;
               if(val==']' && top!='[') return false;
              
            }
        }
        return st.isEmpty();
        
       
        // if(s.length()%2 !=0) return false;
        // Deque<Character> stack=new ArrayDeque<>();
        // for(char c:s.toCharArray()){
        //     if(c=='(' || c=='[' || c=='{' ){
        //         stack.push(c);
        //     }
        //    else{
        //     if(stack.isEmpty()) return false;
        //     char top=stack.pop();
        //     if(c==')' && top!='(') return false;
        //     if(c=='}' && top!='{') return false;
        //     if(c==']' && top!='[') return false;
        //    }
        // }
        // return stack.isEmpty();
    }
    
}