class Solution {
    public boolean isHappy(int n) {
        while(true)
        {
            int sum = 0; 
            while(n != 0)
            {
                sum += Math.pow(n%10,2);
                n/=10;
            }
            if(sum == 1)
            {
                return true;
            }
            if(sum == 4)
            {
                return false;
            }
            n = sum;
        }
    }
}