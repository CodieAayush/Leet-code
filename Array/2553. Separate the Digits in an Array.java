class Solution {
    public int[] separateDigits(int[] nums) {
        
        StringBuilder s= new StringBuilder();
        
        for(int num:nums) s.append(num);
        String t=s.toString();

        int[] res= new int[t.length()];

      
        for(int i=0;i<s.length();i++){
           res[i] =t.charAt(i)-'0';
            
        }

        return res;
    }
}
