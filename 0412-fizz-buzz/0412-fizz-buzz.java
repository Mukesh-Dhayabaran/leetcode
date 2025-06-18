class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> nums = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)nums.add("FizzBuzz");
            else if(i%3==0)nums.add("Fizz");
            else if(i%5==0)nums.add("Buzz");
            else nums.add(String.valueOf(i));
        }
        return nums;
    }
}