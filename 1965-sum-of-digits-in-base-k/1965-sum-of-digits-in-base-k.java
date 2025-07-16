class Solution {
    public int sumBase(int n, int k) {
        int num = base(n,k);
        int sum = 0;
        while(num!=0)
        {
            sum+=num%10;
            num/=10;
        }
        return sum;
    }

    public static int base(int n,int k)
    {
        int num=0;
        for(int i=0;n!=0;i++)
        {
            num = ((n % k) * (int)Math.pow(10,i)) + num;
            n = n/k;
        }
        return num;
    }
}