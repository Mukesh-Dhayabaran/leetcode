class Solution {
    public int countPrimes(int n) {
        if(n<3) return 0;
        int count=n/2;
        boolean arr[] = new boolean[n];
        Arrays.fill(arr,true);
        for(int i=3;i*i<n;i+=2)
        {
            if(arr[i])
            {
                for(int j=i*i;j<n;j+=2*i)
                {
                    if(arr[j])
                    {
                        arr[j] = false;
                        count--;
                    }
                }
            }
        }
        return count;
    }
}