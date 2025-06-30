class Solution {
    public int findNumbers(int[] nums) {
        int count1=0;
        for(int i : nums)
        if(digits(i)%2 == 0)
        count1++;
        return count1;
    }

    public static int digits(int num)
    {
        int count=0;
        while(num!=0)
        {
            count++;
            num=num/10;
        }
        return count;
    }
}