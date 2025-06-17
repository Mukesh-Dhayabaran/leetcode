class Solution {
  public int removeDuplicates(int[] nums) {
    int start = 2;
    for(int i=2;i<nums.length;i++)
    {
        if(nums[i]!=nums[start-2])
        {
            nums[start]=nums[i];
            start++;
        }
    }
    return start;
    // int i = 0;

    // for (final int num : nums)
    //   if (i < 2 || num > nums[i - 2])
    //     nums[i++] = num;

    // return i;
  }
}