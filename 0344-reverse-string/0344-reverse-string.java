class Solution {
    public void reverseString(char[] s) {

        int l=0;
        int r=s.length-1;
        while(l<r){
            char temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }

        System.out.println(s);












        // Stack<Character> st=new Stack<>();
        // for(Character i:s){
        //     st.push(i);
        // }
        // int k=0;
        // while(!st.isEmpty()){
        //     s[k]=st.pop();
        //     k++;
        // }
        // System.out.println(s);
    }
}