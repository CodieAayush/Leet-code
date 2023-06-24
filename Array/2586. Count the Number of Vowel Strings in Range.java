class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++)
        {
            char ch=words[i].charAt(0);
            char chh=words[i].charAt(words[i].length()-1);
            if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')&&(chh=='a'||chh=='e'||chh=='i'||chh=='o'||chh=='u'))
            c++;

        }return c;
    }
}
