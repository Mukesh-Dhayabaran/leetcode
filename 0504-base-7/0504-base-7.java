class Solution {
    public String convertToBase7(int num) {
        int n=num;
        if(num==0) return "0";
        num=Math.abs(num);
        StringBuilder b = new StringBuilder();
		while(num!=0)
		{
		    b.append(num%7);
		    num/=7;
		}
        if(n<0)b.append("-");
        return b.reverse().toString();
    }
}