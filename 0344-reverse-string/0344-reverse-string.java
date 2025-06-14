class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        int left=0,right=n-1;
        for(int i=0;i<Math.floor(n/2);i++)
        {
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
            // s[i] = (char)((int)s[i] ^ (int)s[n-1-i]);
            // s[n-1-i] = (char)((int)s[i] ^ (int)s[n-1-i]);
            // s[i] = (char)((int)s[i] ^ (int)s[n-1-i]);
        }
        System.out.print("[");
        for(int i=0;i<n;i++)
        {
            System.out.printf("%c",s[i]);
            if(i<n)
            {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}