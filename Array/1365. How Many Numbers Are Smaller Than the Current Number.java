class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int l=nums.length;
        int result[]=new int[l];
        for(int i=0;i<l;i++)
        result[i]=0;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                if((nums[j]<nums[i])&&(j!=i))
                result[i]=result[i]+1;       
            }
        }
        return result;
    }
}
