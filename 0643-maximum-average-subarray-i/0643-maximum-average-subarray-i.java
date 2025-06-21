class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length,max=0,sum=0;
        for(int i=0;i<k;i++) sum+=nums[i];
        max=sum;
        for(int j=k;j<n;j++)
        {
            sum = sum+nums[j]-nums[j-k];
            if(sum>max)max=sum;
        }
        return (double)max/k;
    }
}