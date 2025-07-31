class Solution {
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiopQWERTYUIOP";
        String s2 = "asdfghjklASDFGHJKL";
        String s3 = "zxcvbnmZXCVBNM";
        List<String> str = new ArrayList<>();
        for(String s : words)
        {
            // s = s.toLowerCase();
            int n = 0;
            if(s1.indexOf(s.charAt(0)) != -1)
            n = 1;
            else if(s2.indexOf(s.charAt(0)) != -1)
            n = 2;
            else
            n = 3;
            for(char ch : s.toCharArray())
            {
                if(n==1 && s1.indexOf(ch) == -1)
                {
                    n=0;
                    break;
                }
                else if(n==2 && s2.indexOf(ch) == -1)
                {
                    n=0;
                    break;
                }
                else if(n==3 && s3.indexOf(ch) == -1)
                {
                    n=0;
                    break;
                }
            }
            if(n==1 || n==2 || n==3)
            {
                str.add(s);
            }
        }
        return str.toArray(new String[0]);
    }
}