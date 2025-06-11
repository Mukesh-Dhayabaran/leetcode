class Solution {
    public int majorityElement(int[] nums) {
        int[] indicate = new int[nums.length];
        for(int i=0;i<nums.length-1;i++)
        {
            int freq = 1;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i] == nums[j])
                {
                    indicate[j] = 0;
                    freq += 1;
                }
            }
            indicate[i] = freq;
        }

        int max = 0, index=0;
        for(int i=0;i<indicate.length;i++)
        {
            if(indicate[i] > max)
            {
                max = indicate[i];
                index = i;
            }
        }

        return nums[index];
    }
}