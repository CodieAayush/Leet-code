class Solution {
    public int[] numberOfPairs(int[] nums) {
        int ans[]=new int[2];
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums)
        {
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int pair=0;
        int unique=0;
        for(int i:m.keySet())
        {
            if(m.get(i)%2==0){
                pair+=(m.get(i)/2);
            }else{
                pair+=((m.get(i)-1)/2);
                unique++;
            }
        }
        ans[0]=pair;
        ans[1]=unique;
        return ans;
        
    }
}
