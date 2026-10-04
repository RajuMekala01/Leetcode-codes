class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        boolean ans=true;
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(matrix[i][j]==matrix[i-1][j-1]){
                }
                else{
                    ans=false;
                }
            }
        }
        return ans;
        
    }
}