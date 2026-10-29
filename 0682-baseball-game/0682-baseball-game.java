class Solution {
    public int calPoints(String[] operations) {
    Stack<Integer> st=new Stack<>();
    for(int i=0;i<operations.length;i++){
        String s=operations[i];
        if(s.equals("+")){
            int to=st.pop();
            int to2=st.peek();
            st.push(to);
            st.push(to+to2);
        }else if(s.equals("D")){
            int val=st.peek();
            st.push(val*2);
        }else if(s.equals("C")){
            st.pop();
        }else{
            st.push(Integer.valueOf(s));
        }

    }
    int ans=0;
    for(int i:st){
        ans+=i;
    }
    return ans;
}
}