class Solution {
    public int findPeakElement(int[] nums) {
        // int n = nums.length;
        // if(n==2) return nums[0]>nums[1] ? 0 : 1;
        // for(int i=1;i<n;i++)
        // {
        //     if(nums[i-1]<nums[i] && nums[i]>nums[i+1] ) return i;
        // }
        // return 0;
        int max = Integer.MIN_VALUE,index = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
                index = i;
            }
        }
        return index;
    }
}