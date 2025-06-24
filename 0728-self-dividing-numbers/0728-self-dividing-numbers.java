class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(div(i)) list.add(i);
        }
        return list;
    }

    public static boolean div(int num)
    {
        int n = num;
        while(num!=0)
        {
            if(num%10==0)return false;
            if(n % (num%10)!=0)return false;
            num/=10;
        }
        return true;
    }
}