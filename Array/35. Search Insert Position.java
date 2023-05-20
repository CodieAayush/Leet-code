class Solution {
    public int searchInsert(int[] nums, int target) {
        int min=nums[0],index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            return i;
            else {
                if((nums[i]>=min)&&(nums[i]<target)){
                min=nums[i];
                index=i;
                index++;
                }
                else 
                {
                    if(nums[i]>target)
                    return i;
                }

        }
       
    } return index;
}
}