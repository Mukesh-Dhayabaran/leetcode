class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        s = s.replaceAll(" ", "");
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}