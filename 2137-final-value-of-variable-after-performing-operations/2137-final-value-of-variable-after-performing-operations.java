class Solution {
    public int finalValueAfterOperations(String[] ops) {
        int x=0;
        for(String s : ops)
        {
            if(s.contains("+")) x++;
            else if(s.contains("-")) x--;
        }
        return x;
    }
}