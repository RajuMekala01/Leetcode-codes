class Solution {
    public void reverseString(char[] s) {
        Stack<Character> st=new Stack<>();
        for(Character i:s){
            st.push(i);
        }
        int k=0;
        while(!st.isEmpty()){
            s[k]=st.pop();
            k++;
        }
        System.out.println(s);
    }
}