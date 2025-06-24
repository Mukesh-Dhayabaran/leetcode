class Solution {
    public int missingNumber(int[] nums) {
        int sum1=0,n=nums.length;
        int sum2 = (n * (n+1) ) / 2;
        for(int i : nums)sum1+=i;
        return sum2-sum1;
    }
}