class Solution {
    public void reverseString(char[] s) {
        // int n=s.length;
        // for(int i=0;i<Math.floor(n/2);i++)
        // {
        //     s[i] = (char)((int)s[i] ^ (int)s[n-1-i]);
        //     s[n-1-i] = (char)((int)s[i] ^ (int)s[n-1-i]);
        //     s[i] = (char)((int)s[i] ^ (int)s[n-1-i]);
        // }
        for(int i=0 , j=s.length-1 ; i<j; i++ , j--)
        {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}