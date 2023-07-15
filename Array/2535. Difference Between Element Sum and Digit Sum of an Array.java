class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0,s=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int n=nums[i];
            while(n>0)
            {
                int r=n%10;
                s+=r;
                n/=10;
            }
        }
        s=s-sum;
        return Math.abs(s);
    }
}
