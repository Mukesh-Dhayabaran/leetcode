class Solution {
    public boolean checkPerfectNumber(int num) {
        return num==factSum(num);
    }

    public static int factSum(int n)
    {
        int sum=0;
        for(int i=1;i<=n/2;i++)
        if(n%i==0) sum+=i;
        return sum;
    }
}