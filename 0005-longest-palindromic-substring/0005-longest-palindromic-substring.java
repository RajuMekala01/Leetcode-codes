class Solution {
    public String longestPalindrome(String s) {
         int max=0;
        String res="";
        for(int i=0;i<s.length();i++){

            for(int j=i;j<s.length();j++){
                int left=i;
                int right=j;
                boolean palindrome=true;
                while(left<right){
                    if(s.charAt(left)!=s.charAt(right)){
                        palindrome=false;
                        break;
                    }
                    left++;
                    right--;
                }
                if(palindrome && j-i+1>max){
                    max=j-i+1;

                    res=s.substring(i,j+1);
                }
            }
        }
        return res;   
    }
}