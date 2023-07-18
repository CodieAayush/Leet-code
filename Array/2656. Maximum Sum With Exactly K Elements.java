class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int sum=0;
        for(int i=1;i<=k;i++)
        {
            sum+=nums[n-1];
            nums[n-1]=nums[n-1]+1;
        }
        return sum;
    }
}
