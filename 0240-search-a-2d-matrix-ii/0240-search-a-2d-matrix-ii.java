class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<nums[0].length;j++)
            {
                if(nums[i][j]==target) return true;
                else if(nums[i][j]>target) break;
            }
        }
        return false;
    }
}