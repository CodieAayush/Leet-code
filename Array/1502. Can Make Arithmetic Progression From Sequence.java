class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int b=0;
        Arrays.sort(arr);
        for(int i=1;i<arr.length-1;i++)
        {
            if((arr[i]-arr[i-1])==(arr[i+1]-arr[i]))
            continue;
            else
            {
                b=1;
                break;
            }
        }
        if(b==0)
        return true;
        else 
        return false;
    }
}
