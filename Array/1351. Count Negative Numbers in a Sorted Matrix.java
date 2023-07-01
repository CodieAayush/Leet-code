class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        System.out.println(grid.length);
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                System.out.println(grid[i][j]);
                if(grid[i][j]<0)
                c++;
                
            }
        }return c;
    }
}
