class Solution {
    public String toLowerCase(String s) {
    //    return s.toLowerCase();
        char ch[] = s.toCharArray();
	    for(int i=0;i<ch.length;i++)
        {
            if(65<=ch[i] && ch[i]<=90)
            {
                ch[i]+=32;
            }
        }
        return new String(ch);
    }
}