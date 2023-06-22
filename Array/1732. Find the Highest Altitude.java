class Solution {
    public int largestAltitude(int[] gain) {
       int n=0,k=0;
    for(int i=0;i<gain.length;i++)
    {
    n+=gain[i];
    if(n>=1)
    {
    if(k<n)
    k=n;
    }
    }
    if(k>=1)
    return k;
    else
    return 0;
    }
}
