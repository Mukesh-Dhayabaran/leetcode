class Solution {
    public int numberOfMatches(int n) {
        // return n-1;
        int sum = 0;
        while(n!=1)
        {
            sum += (n/2);
            n -= (n/2);
        }

        return sum;
    }
}