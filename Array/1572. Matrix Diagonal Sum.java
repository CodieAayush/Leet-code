class Solution {
    public int diagonalSum(int[][] mat) {
        int l=0,r=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
                if(i==j)
                l+=mat[i][j];
                else if((i+j)==(mat.length-1))
                r+=mat[i][j];
            }
        }return r+l;
    }
}
