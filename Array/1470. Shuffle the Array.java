class Solution {
    public int[] shuffle(int[] nums, int n) 
    {
        
        
        int ans[]=new int[n*2];
        
        for(int i=0;i<n*2;i++)
        {
            ans[i]=i%2==0?nums[i/2]:nums[n+i/2];
            
        }
        return ans;
    }
}
