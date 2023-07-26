class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        List<Integer> b= new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target)
            b.add(i);
        }
        return b;
    }
}
