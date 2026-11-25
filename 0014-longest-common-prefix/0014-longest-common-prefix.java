class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res="";
        int len=strs.length;
        for(int i=0;i<strs[0].length();i++){
            char val=strs[0].charAt(i);
            for(int j=1;j<len;j++){
                if(i>=strs[j].length() || val!=strs[j].charAt(i)){
                    return res;
                }
            }
            res+=val;
        }
        return res;
    }
}