class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> list =new HashSet<Integer>();
        int i;
        for (i=0;i<nums.length;i++)
        {
            list.add(nums[i]);
        }
        for(i=0;i<nums.length;i++)
         {
             if(!list.contains(i+1))
             {
                 return i+1;
             }
         }
         return i+1;
    }
}
