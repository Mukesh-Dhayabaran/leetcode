class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        String b = "";
        int n=num;
        num=Math.abs(num);
		while(num!=0)
		{
		    b = num%7+b;
		    num/=7;
		}
        return n>0 ? b : "-"+b;
    }
}