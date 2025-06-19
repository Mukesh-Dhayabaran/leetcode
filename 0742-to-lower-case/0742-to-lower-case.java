class Solution {
    public String toLowerCase(String s) {
        char s1[] = s.toCharArray();
	    for(int i=0;i<s1.length;i++)
        {
            if(65<=s1[i] && s1[i]<=90)
            {
                s1[i]+=32;
            }
        }
        return new String(s1);
    //    return s.toLowerCase();
    }
}