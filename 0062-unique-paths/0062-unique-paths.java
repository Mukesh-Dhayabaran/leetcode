class Solution {
  public int uniquePaths(int m, int n) {
    int [][] memo = new int[m][n];
    for(int i=0;i<m;i++) Arrays.fill(memo[i],-1);
    return paths_count(0,0,m,n,memo);
  }
//   public void paths_count(int row,int col,int m,int n)
  public int paths_count(int row,int col,int m,int n,int [][] memo)
  {
    if(row == m || col == n) return 0;
    if(row == m-1 && col == n-1) return 1;
    if(memo[row][col] != -1) return memo[row][col];
    int left = paths_count(row,col+1,m,n,memo);
    int right = paths_count(row+1,col,m,n,memo);
    memo[row][col] = left + right;
    return left + right;
  }
}