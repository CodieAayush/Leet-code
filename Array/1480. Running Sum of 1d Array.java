class Solution {
    public int[] runningSum(int[] nums) {
       
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            continue;
            nums[i]=nums[i]+nums[i-1];
            
            //p=nums[i];
        }
        return nums;
    }
}
