class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        int p=0,m=0;
        for(int i=0;i<nums.length;i+=2)
        {
            m+=nums[i];
        }int[] result =new int[m];
        for (int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i];j++)
            {
                result[p]=nums[i+1];
                p++;
            }
            i++;
        }
        return result;
    }
}
