class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> s=new HashSet<>();
        Set<Character> s1=new HashSet<>();
        int n=9;
        int n2=9;
        int n3=0;
        while(n3<9){
        for(int i=0;i<n;i++){
            char val=board[i][n3];
            if(val=='.') continue;
            if(!s.contains(val)){
                s.add(val);
            }else{
                return false;
            }
        }
        s.clear();
        for(int j=0;j<n;j++){
            char val2=board[n3][j];
            if(val2=='.') continue;
            if(!s1.contains(val2)){
                s1.add(val2);
            }else{
                return false;
            }
        }

        s1.clear();
        Set<Character> hs = new HashSet<>();

for(int boxRow = 0; boxRow < 3; boxRow++) {
    for(int boxCol = 0; boxCol < 3; boxCol++) {

        hs.clear();

        int startRow = boxRow * 3;
        int startCol = boxCol * 3;

        for(int i = startRow; i < startRow + 3; i++) {
            for(int j = startCol; j < startCol + 3; j++) {

                char val = board[i][j];

                if(val == '.') continue;

                if(!hs.add(val)) {
                    return false;
                }
            }
        }
    }
}
        n3++;
        }
       return true; 
    }
}