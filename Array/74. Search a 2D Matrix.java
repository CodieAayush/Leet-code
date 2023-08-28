class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)return false;
        int r=matrix.length;
        int c=matrix[0].length;
        int left=0;
        int right=r*c-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            int mide=matrix[mid/c][mid%c];
            if(mide==target)
            return true;
            else if(target<mide){
                right=mid-1;}
            else if(target>mide){
                left=mid+1;}

            }
        
     
        return false;
    }
}
