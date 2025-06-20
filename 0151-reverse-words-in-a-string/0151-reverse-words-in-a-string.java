class Solution {
    public String reverseWords(String s) {
        StringBuilder rev = new StringBuilder("");
		String arr[] = s.trim().split("\\W+");
		for(int i=arr.length-1;i>=0;i--)
		{
		    rev.append(arr[i]);
		    if(i>0)rev.append(" ");
		}
        return rev.toString();
    }
}