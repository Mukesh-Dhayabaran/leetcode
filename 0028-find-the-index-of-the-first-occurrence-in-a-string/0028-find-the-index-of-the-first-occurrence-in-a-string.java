class Solution {
  public int strStr(String h, String n) {
        int l1 = h.length();
	    int l2 = n.length();
	    for(int i=0;i<=l1-l2;i++)
	    {
	        for(int j=0;j<l2;j++)
	        {
	            if(h.charAt(i+j)!=n.charAt(j))break;
	            if(j==l2-1)return i;
	        }
	    }
	    return -1;
        // return  h.indexOf(n);
  }
}