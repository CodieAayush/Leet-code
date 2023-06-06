class Solution {
    public int minimumOperations(int[] nums) {
        int n=nums.length;
        int num;
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                num = nums[i];

            count++;

            for(int j=i;j<n;j++)
            {
                nums[j]-=num;
            }
            }
        }

        return count;
        
    }
}
