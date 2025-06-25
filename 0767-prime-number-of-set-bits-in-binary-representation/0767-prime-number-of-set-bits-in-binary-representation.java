class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i=left;i<=right;i++)
        {
            if(prime(ones(Integer.toBinaryString(i)))) count++;
        }
        return count;
    }

    public static int ones(String b)
    {
        int count=0;
        for(char ch : b.toCharArray()) 
        if(ch=='1') 
        count++;
        return count;
    }

    public static boolean prime(int n)
    {
        if(n==0 || n==1) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
}