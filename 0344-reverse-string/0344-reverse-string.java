class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        for(int i=0;i<Math.floor(n/2);i++)
        {
            s[i] = (char)((int)s[i] ^ (int)s[n-1-i]);
            s[n-1-i] = (char)((int)s[i] ^ (int)s[n-1-i]);
            s[i] = (char)((int)s[i] ^ (int)s[n-1-i]);
        }
        System.out.print("[");
        for(int i=0;i<n;i++)
        {
            System.out.printf("%c",s[i]);
            if(i>0)
            {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}