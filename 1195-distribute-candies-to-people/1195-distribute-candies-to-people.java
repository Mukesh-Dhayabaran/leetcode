class Solution {
    public int[] distributeCandies(int candies, int n) {
        int sum = 0 , i = 0;
        int arr[] = new int[n];
        Arrays.fill(arr,0);
        while(sum<candies)
        {
            arr[i%n] += candies-sum > i+1 ? i+1 : candies-sum;
            sum += i+1;
            i++;
        }
        return arr;
    }
}