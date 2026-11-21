class Solution {
    public String removeDuplicates(String s, int k) {
     Stack<Character> st=new Stack<>();
        Stack<Integer> countst=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && st.peek()==ch){
                int count=countst.pop();
                count++;
                if(count==k){
                    st.pop();
                }
                else{
                    countst.push(count);
                }
            }
            else{
                st.push(ch);
                countst.push(1);
            }
        }
        String res="";
        while(!st.isEmpty()){
           char c=st.pop();
           int val= countst.pop();
           for(int i=0;i<val;i++){
            res=c+res;
           }
        }
        return res;
    }
}   










    // while(true){
    // boolean found=false;   
    // String res="";
    // for(int i=0;i<s.length();i++){
    //     int count=0;
    //     int j=i;
    //         while(j<s.length() && s.charAt(i)==s.charAt(j)){
    //             count++; 
    //             j++;
    //         }
    //     if(count==k){
    //         found=true;
    //         i=j-1;
           
    //     }else{
    //         res+=s.charAt(i);
    //     }  
    // }
    //      if(found==false){
    //         break;
    //     }
    //       s=res;
    // }
    // return s;
       
    // }
// }