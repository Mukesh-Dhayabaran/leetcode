class Solution {
    public int rob(int[] nums) {
        if(nums==null) return 0;
        int n = nums.length;
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = nums[0];
        // int max = arr[1];
        for(int i=2;i<=n;i++)
        {
            arr[i] = Math.max(arr[i-1],arr[i-2]+nums[i-1]);
            // max = Math.max(max,arr[i]);
        }

        return arr[n];
    }
}