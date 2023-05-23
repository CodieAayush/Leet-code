class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
       
        int c=nums2.length;
        for(int i=nums1.length-1;i>(nums1.length-nums2.length)-1;i--)
        {
            nums1[i]=nums2[--c];
            //c--;
            
        }
        Arrays.sort(nums1);

        
    }

}
