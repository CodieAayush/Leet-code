class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int temp,c=0,j=nums.length-1;
        int n[]=new int[nums.length];
        if(nums.length==1)
        return nums;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {n[c]=nums[i];
            c++;}
            else
            {n[j]=nums[i];
            j--;}

        }
       
        return n;
}
}
