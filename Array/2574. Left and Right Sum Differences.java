class Solution {
    public int[] leftRigthDifference(int[] nums) 
    {
        int l=nums.length;
        int[] answer=new int[l];
        int[] left=new int[l];
        int[] right=new int[l];
        left[0]=0;
        right[0]=0;
   
        for(int i=0,j=l-2;i<l-1;i++,j--)
        {
            left[i+1]=nums[i]+left[i];
            right[j]=nums[j+1]+right[j+1];
        }
     
        
        
        for(int i=0;i<l;i++)
        {
            answer[i]=Math.abs(left[i]-right[i]);
        }
        return answer;
    }
}
