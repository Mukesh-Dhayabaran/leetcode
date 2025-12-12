class Solution {
  int paths = 0;
  public int uniquePaths(int m, int n) {
        // paths_count(0,0,m,n);
        int [][] memo = new int[m+1][n+1];
        int row = 0,col;
        for(col = 0; col < n; col++)
        memo[m][col] = 0;
        col = n;
        for(row = 0; row < m; row++)
        memo[row][n] = 0;
        memo[m-1][n-1] = 1;
        for(int work_row = m-1; work_row >= 0; work_row--)
        {
            for(int work_col = n-1; work_col >= 0; work_col--)
            {
                if(work_row == m-1 && work_col == n-1) continue;
                memo[work_row][work_col] = memo[work_row][work_col+1] + memo[work_row+1][work_col];
            }
        }

        for(int i=0;i<=m;i++,System.out.println())
        for(int j=0;j<=n;j++)
        System.out.print(memo[i][j]);
        return memo[0][0];
        // return paths_count(0,0,m,n,memo);
        // return paths;
  }
//   public void paths_count(int row,int col,int m,int n)
  public int paths_count(int row,int col,int m,int n,int [][] memo)
  {
    if(row == m || col == n) return 0;
    if(row == m-1 && col == n-1) return 1;
    if(memo[row][col] != -1) return memo[row][col];
    int left = paths_count(row,col+1,m,n,memo);
    int right = paths_count(row+1,col,m,n,memo);
    return left + right;
  }
}