class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        Set<Character> s = new HashSet<>();
        for(char ch : jewels.toCharArray())s.add(ch);
        for(char ch : stones.toCharArray())if(s.contains(ch))count++;
        return count;
    }
}