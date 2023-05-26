class Solution {
    public int numIdenticalPairs(int[] nums) 
    {
        int c=0;
        HashMap <Integer ,Integer> hash =new HashMap<>();
        for(int num:nums)
        {
            c=c+hash.getOrDefault(num,0);
            hash.put(num,hash.getOrDefault(num,0)+1);
        } 
        return c; 
    }
}
