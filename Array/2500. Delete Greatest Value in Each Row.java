class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int jj=0;
        int max=0,sum=0;
        int l=grid.length;
        int srt=0;
        for(int k =0; k< grid.length; k++) {
        for (int i = 0; i < grid[k].length; i++) {
        int j = i;
            while (j > 0 && grid[k][j - 1] > grid[k][j]) 
            {
            int temp = grid[k][j - 1];
            grid[k][j - 1] = grid[k][j];
            grid[k][j] = temp;
            j--;
            }
        }
    }
      
           for(int j=0;j<grid[0].length;j++){
             max = grid[0][j];
            for(int i=1; i<grid.length;i++){
                if(grid[i][j]>max){
                    max = grid[i][j];
                }
            }
            sum+=max;
        }
        return sum;
    }
}
    
