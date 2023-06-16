class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
         HashMap <Integer,String> map=new HashMap<>();
         String[] ans=new String[heights.length];
         int x=0;
        for(int i=0; i<names.length ;i++){
             map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for(int i=heights.length-1;i>=0;i--){
            ans[x]=map.get(heights[i]);
            x++;
        }
        return ans;
    }
}
