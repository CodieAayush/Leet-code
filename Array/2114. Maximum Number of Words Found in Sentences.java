class Solution {
    public int mostWordsFound(String[] sentences) {
        int c;
        int s=0;
        for (int i=0;i<sentences.length;i++)
        {
            c=1;
            for(int j=0;j<sentences[i].length();j++)
            {
                if(sentences[i].charAt(j)==' ')
                c++;
            }
            if(c>=s)
            s=c;
        }
        return s;
    }
}
