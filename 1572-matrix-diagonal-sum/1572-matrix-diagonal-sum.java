class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=mat[i][i];
            if(i !=(n-1-i)){
                sum+=mat[i][n-1-i];
            }
        }
        return sum;











        // int sum=0;
        // for(int i=0;i<mat.length;i++){
        //     for(int j=0;j<mat[i].length;j++){
        //         if(i==j || (i+j)==mat.length-1){
        //             sum+=mat[i][j];
        //         }
        //     }
        // }
        // return sum;
    }
}