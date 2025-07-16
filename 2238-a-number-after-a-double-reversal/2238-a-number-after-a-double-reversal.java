class Solution {
    public boolean isSameAfterReversals(int num) {
        return reverse(reverse(num)) == num;
    }

    public static int reverse(int num)
    {
        int n = 0;
        while(num!=0)
        {
            n = n * 10 + num % 10;
            num/=10;
        }
        return n;
    }
}