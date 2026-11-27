class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int n=s.length();
        int[] freq=new int[128];
        int l=0;
        for(int r=0;r<n;r++){
            char ch=s.charAt(r);
            freq[ch]++;
            while(freq[ch]>1){
                freq[s.charAt(l)]--;
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}




    //     int max=0;
    //     for(int i=0;i<s.length();i++){
    //         for(int j=i;j<s.length();j++){
    //             boolean dup=false;
    //             for(int k=i;k<j;k++){
    //                 if(s.charAt(j)==s.charAt(k)){
    //                    dup=true;
    //                     break;
    //                 }
    //             }
    //             if(!dup){
    //                  max=Math.max(max,j-i+1);
    //             }else{
    //                 break;
    //             }
    //         }
            
    //     }
    //    return max;


//-------------------------------------------
        
//         int n=s.length();
//         int ans=0;
//         int l=0;
//         HashSet<Character> hs=new HashSet<>();
//         for(int r=0;r<n;r++){
//             char ch=s.charAt(r);
//             if(!hs.contains(ch)){
//                 hs.add(ch);
//             }
//             else{
//                 while(hs.contains(ch)){
//                     hs.remove(s.charAt(l));
//                     l++;
//                 }
//                 hs.add(ch);
//             }
//             ans=Math.max(ans,r-l+1);
//         }
//         return ans;
//     }
// }