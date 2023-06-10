class Solution {
    int arr[];
    int target;
    int count;
    public int findTargetSumWays(int[] nums, int target) {
        arr=nums;
        this.target=target;
        count=0;
        int sum=0;
        findways(0,0);
        return this.count;


    }
    private void findways(int index,int crrsum)
    {
        if(index>=arr.length){
         if(crrsum==target)
         this.count++;
         return ;
        }
        findways(index+1,crrsum+arr[index]);
        findways(index+1,crrsum-arr[index]);

    }
}
