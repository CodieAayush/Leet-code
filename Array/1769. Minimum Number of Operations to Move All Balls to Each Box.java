class Solution {
    public int[] minOperations(String boxes) {
         int result[] = new int [boxes.length()];
         int ops=0,c=0;
         for(int i=0;i<boxes.length();i++)
         {
            result[i]+=ops;
            c+=boxes.charAt(i)-'0'; 
            ops+=c;
         }
         ops=0;c=0;
         for(int i=boxes.length()-1;i>-1;i--)
         {
            result[i]+=ops;
            c+=boxes.charAt(i)-'0'; 
            ops+=c;
         }
         return result;   
    }
}
