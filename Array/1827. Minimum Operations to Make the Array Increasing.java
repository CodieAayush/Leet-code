class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        if(nums.length==1)
        return 0;
        else
        {
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i] <= nums[i-1])
            {
                int temp = nums[i-1] - nums[i] + 1;
                count += temp;
                nums[i] += temp;
            }
        }
        return count;
        }
    }
}
