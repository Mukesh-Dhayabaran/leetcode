class Solution {
    public boolean canPlaceFlowers(int[] f, int n) 
    {
        if(n==0) return true;
        int l=f.length;
        for(int i=0;i<l;i++)
        {
            int end= i==l-1 ? i-1 : i+1;
            if(f[i]==0 && (i==0 ||f[i-1]==0) && (i==l-1 || f[i+1]==0))
            {
                f[i]=1;
                if(--n==0)
                {
                    i++;
                    return true;
                }
            }
        }
        return false;
    }
}