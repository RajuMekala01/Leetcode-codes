class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        Arrays.sort(strs);
        String fs=strs[0];
        String ls=strs[strs.length-1];
        for(int i=0;i<fs.length();i++){
            char val=fs.charAt(i);
            if(i>=ls.length() || val!=ls.charAt(i)){
                return sb.toString();
            }
            sb=sb.append(val);
        }
return sb.toString();



        // StringBuilder res=new StringBuilder();
        // int len=strs.length;
        // for(int i=0;i<strs[0].length();i++){
        //     char val=strs[0].charAt(i);
        //     for(int j=1;j<len;j++){
        //         if(i>=strs[j].length() || val!=strs[j].charAt(i)){
        //             return res.toString();
        //         }
        //     }
        //     res=res.append(val);
        // }
        // return res.toString();
    }
}