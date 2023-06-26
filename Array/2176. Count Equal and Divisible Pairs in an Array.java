    class Solution {
        public int countPairs(int[] nums, int k) {
            int c=0,m;
            for(int i=0;i<nums.length;i++)
            {
                for(int j=i+1;j<nums.length;j++)
                {
                   
                    m=i*j;
                    if((nums[i]==nums[j])&&(m%k)==0)
                    c++;
                }
            }
            return c;
        }
    }
