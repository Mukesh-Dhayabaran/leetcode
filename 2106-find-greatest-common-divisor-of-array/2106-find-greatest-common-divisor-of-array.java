class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0] , max = nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
            min = nums[i];

            if(nums[i]>max)
            max = nums[i];
        }

        while(max!=0)
        {
            int temp = max;
            max = min % max;
            min = temp;
        }

        return min;   
    }
}