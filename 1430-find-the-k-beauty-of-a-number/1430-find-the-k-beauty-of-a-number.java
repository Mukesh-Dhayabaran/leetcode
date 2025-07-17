class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int count = 0;
        for(int i=0;i<s.length()-(k-1);i++)
        if(Integer.parseInt(s.substring(i,i+k))!=0 && num % Integer.parseInt(s.substring(i,i+k)) == 0)
        count++;
        return count;
    }
}