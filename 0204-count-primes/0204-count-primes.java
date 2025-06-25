class Solution {
    public int countPrimes(int n) {
        int count = 0;
        boolean arr[] = prime(n);
        for(int i=2;i<n;i++)
        {       
            if(arr[i])count++;
        }
        return count;
    }

    public static boolean[] prime(int n)
    {
        boolean arr[] = new boolean[n+1];
        Arrays.fill(arr,true);
        for(int i=2;i*i<=n;i++)
        {
            if(arr[i])
            {
                for(int j=i*i;j<=n;j+=i)
                {
                    arr[j] = false;
                }
            }
        }
        return arr;
    }
}