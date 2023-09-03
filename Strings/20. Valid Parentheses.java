class Solution {
    public boolean isValid(String s) {
        int l=s.length();
        Stack<Character> ss = new Stack<Character>();
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)=='(')
            ss.push(')');
            else if(s.charAt(i)=='{')
            ss.push('}');
            else if(s.charAt(i)=='[')
            ss.push(']');
            else if(ss.isEmpty()||ss.pop()!=s.charAt(i))
            return false;
        }
        return ss.isEmpty();
    }
}
