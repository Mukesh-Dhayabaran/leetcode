class Solution {
    public int finalValueAfterOperations(String[] ops) {
        int x=0;
        for(String s : ops){
        for(char c : s.toCharArray()){
        if(c=='+')
        {
            x++;
            break;
        }
        else if(c=='-')
        {
            x--;
            break;
        }}}
        return x;
    }
}